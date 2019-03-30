package com.example.list;

import java.util.Arrays;

public class ArrayList<E> implements List<E> {

    private static final int CAPACITY = 16;
    private static final int CAPACITY_INCREASE_FACTOR = 2;
    private E[] data;
    private int size = 0;

    public ArrayList() {
        this(CAPACITY);
    }

    public ArrayList(int capacity) {
        data = (E[]) new Object[capacity];
    }


    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


    public E get(int i) throws IndexOutOfBoundsException {
        checkIndex( i, size - 1);
        return data[i];
    }

    public E set(int i, E e) throws IndexOutOfBoundsException {
        checkIndex(i, size - 1);
        E temp = data[i];
        data[i] = e;
        return temp;
    }

    public void add(int i, E e) throws IndexOutOfBoundsException, IllegalStateException {
        checkIndex(i, size);
        if (size == data.length) {
            resize(CAPACITY_INCREASE_FACTOR * data.length);
        }
        // shift element to the right
        for (int j = size; j > i; j--) {
            data[j] = data[j-1];
        }
        data[i] = e;
        size++;
    }

    public E remove(int i) throws IndexOutOfBoundsException {
        checkIndex(i, size-1);
        E temp = data[i];
        // shift element to the left
        for (int j = i; j < size - 1; j++) {
            data[j] = data[j+1];
        }
        data[size - 1] = null;
        size--;
        return temp;
    }


    @Override
    public String toString() {
        return Arrays.toString(data);
    }


    protected void checkIndex(int i, int max) {
        if (i < 0 || i > max) {
            throw new IndexOutOfBoundsException("Illegal index: " + i);
        }
    }

    protected void resize(int capacity) {
       E[] temp = (E[]) new Object[capacity];
       for (int i=0; i < size; i++) {
           temp[i] = data[i];
       }
       data = temp;
    }
}
