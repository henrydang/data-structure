package com.example.queue;

public class ArrayQueue<E> implements Queue<E> {
    private static final int CAPACITY = 16;
    private E[] data;
    private int f = 0;
    private int sz = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return sz;
    }

    public boolean isEmpty() {
        return sz == 0;
    }

    public void enqueue(E e) throws IllegalStateException {

    }

    public E dequeue() throws IllegalStateException {

    }

    public E first() {

    }

}
