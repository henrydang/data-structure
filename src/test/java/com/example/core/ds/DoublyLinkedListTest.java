package com.example.core.ds;
import org.junit.Test;


public class DoublyLinkedListTest {
    @Test
    public void testAddLast() {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.addLast("peter");
        list.addLast("mary");
        list.addLast("camela");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }

}
