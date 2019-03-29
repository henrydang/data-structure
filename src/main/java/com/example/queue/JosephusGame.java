package com.example.queue;

public class JosephusGame {
    public static <E> E play(CircularQueue<E> queue, int k) {
        if (queue.isEmpty()) {
            return null;
        }
        while (queue.size() > 1) {
            for (int i = 0; i < k - 1; i++) { // rotate the queue k times
                queue.rotate();
            }
            // remove the first person (ie: holding the potato)
            E e = queue.dequeue();
            System.out.println(e + " is out");
        }
        // the last one is the winner
        E winner = queue.dequeue();
        return winner;
    }

    public static <E> CircularQueue<E> buildQueue(E[] data) {
        CircularQueue<E> queue = new LinkedCircularQueue<>();
        for (E e : data) {
            queue.enqueue(e);
        }
        return queue;
    }

    public static void main(String[] args) {
        String[] s1 = {"peter", "mary", "john", "camelia"};
        String[] s2 = {"andrew", "james"};
        String[] s3 = {"camelia", "testing"};
        System.out.println("The first winner is: " + play(buildQueue(s1), 2));
    }

}
