package com.example.core.ds;

import org.junit.Test;
import static org.junit.Assert.*;

public class CircularlyLinkedListTest {
    @Test
    public void NewListShouldHaveZeroSize() {
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
        assertEquals(0, list.size());
    }

    @Test
    public void testAddAndRotate() {
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
        list.addLast("peter");
        list.addLast("mary");
        list.addLast("camela");
        list.addLast("john");
        list.addLast("smith");
        System.out.println(list);
        list.rotate();
        System.out.println(list);
        list.rotate();
        System.out.println(list);
        list.rotate();
        System.out.println(list);
    }

    

}