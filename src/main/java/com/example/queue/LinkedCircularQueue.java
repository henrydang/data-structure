package com.example.queue;

import com.example.core.ds.CircularlyLinkedList;

public class LinkedCircularQueue<E> implements CircularQueue<E> {

    private CircularlyLinkedList<E> list = new CircularlyLinkedList<>();

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

    public void rotate() {
        list.rotate();
    }
}

