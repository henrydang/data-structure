package com.example.list;

public class LinkedPositionalList<E> implements PositionalList<E> {

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;

    public LinkedPositionalList() {
        header = new Node<>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<E> first() {
        return position(header.getNext());
    }

    public Position<E> last() {
        return position(trailer.getPrev());
    }

    public Position<E> before(Position<E> p) throws IllegalArgumentException {
       Node<E> node =  validate(p);
       return position(node.getPrev());
    }

    public Position<E> after(Position<E> p) throws IllegalArgumentException {
       Node<E> node = validate(p);
       return position(node.getNext());
    }

    public Position<E> addFirst(E e) {
        return addBetween(e, header, header.getNext());
    }

    public Position<E> addLast(E e) {
        return addBetween(e, trailer.getPrev(), trailer);
    }


    public Position<E> addBefore(Position<E> p, E e) throws IllegalArgumentException {
       Node node = validate(p);
       return addBetween(e, node.getPrev(), node);
    }

    public Position<E> addAfter(Position<E> p, E e) throws IllegalArgumentException {
        Node node = validate(p);
        return addBetween(e, node, node.getNext());
    }


    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E temp = node.getElement();
        node.setElement(e);
        return temp;
    }

    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E temp = node.getElement();
        node.setElement(null);
        node.setPrev(null);
        node.setNext(null);
        return temp;
    }

    // private methods

    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) {
            throw new IllegalArgumentException("Invalid p");
        }
        Node<E> node = (Node<E>) p;
        if (node.getNext() == null) {
            throw new IllegalArgumentException("P is no longer in the list");
        }
        return node;
    }

    private Position<E> position(Node<E> node) {
        if (node == header || node == trailer) {
            return null;
        }
        return node;
    }

    private Position<E> addBetween(E e, Node<E> predeccessor, Node<E> successor) {
        Node<E> newNode = new Node<>(e, predeccessor, successor);
        predeccessor.setNext(newNode);
        successor.setPrev(newNode);
        size++;
        return newNode;
    }

    /**
    =======================================
    Private Node class
    =======================================
     */
    private static class Node<E> implements Position<E> {

        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() throws IllegalStateException {
            if (next == null) { // convention for defunct Node
               throw new IllegalStateException("Position is no longer invalid.");
            }
            return element;
        }

        public void setElement(E e) {
            element = e;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> n) {
            prev = n;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    } // End of Node class
}
