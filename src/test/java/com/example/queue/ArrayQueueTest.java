package com.example.queue;

import org.junit.Test;

public class ArrayQueueTest {

    @Test
    public void enqueue_Successfull() {
        ArrayQueue<Integer> q = new ArrayQueue<>(3);
        q.enqueue(10);
        q.enqueue(11);
        q.enqueue(7);
        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
