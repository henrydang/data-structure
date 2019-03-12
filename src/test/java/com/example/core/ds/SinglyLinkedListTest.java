package com.example.core.ds;

import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void testAddElementSuccessfully() {
        SinglyLinkedList<String> list = new SinglyLinkedList();
        list.addLast("peter");
        list.addLast("mary");
        System.out.println(list);
    }

    @Test
    public void testAddFirst() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList();
        list.addFirst(10);
        list.addFirst(11);
        list.addFirst(12);
        System.out.println(list);
    }
}