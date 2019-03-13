package com.example.queue;

public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E deque();
    E first();

}
