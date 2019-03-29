package com.example.queue;

import com.example.core.ds.SinglyLinkedList;

public class LinkedQueue<E> implements Queue<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();


    public LinkedQueue() {

    }

    public void enqueue(E e) {
       list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E first() {
        return list.first();
    }

    public int size() {
        return list.size();

    }

    public boolean isEmpty() {
       return list.isEmpty();
    }
}
