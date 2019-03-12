package com.example.core.ds;

public class CircularlyLinkedList<E> {

    private Node<E> tail;
    private int size;

    public CircularlyLinkedList() {
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return tail.getNext().getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void rotate() {
        if (isEmpty()) {
            return;
        }
        tail = tail.getNext();
    }

    public void addFirst(E e) {
        if (isEmpty()) {
            tail = new Node<>(e, null);
            tail.setNext(tail);
        } else {
            Node<E> newNode = new Node<>(e, tail.getNext());
            tail.setNext(newNode);
        }
        size++;
    }

    public void addLast(E e) {
        addFirst(e);
        rotate();
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Node<E> head = tail.getNext();
        if (head == tail) {
            tail = null;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getElement();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Node<E> walker = tail.getNext();
        while (walker != tail) {
            sb.append(walker.getElement().toString());
            sb.append("->");
            walker = walker.getNext();
        }
        sb.append(tail.getElement().toString());
        return sb.toString();
    }

    /**
     * private node class
     */
    private static class Node<E> {
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n) {
            element = e;
            next = n;
        }
        public E getElement() {
            return element;
        }
        public Node<E> getNext() {
            return next;
        }
        public void setNext(Node<E> n) {
            next = n;
        }
    }
}