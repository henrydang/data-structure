package com.example.list;

import org.junit.Test;

public class ArrayListTest {

    @Test
    public void test01() {
        List<Integer> list = new ArrayList<>(3);
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        System.out.println(list);
    }

    @Test(expected = IllegalStateException.class)
    public void shouldReturnExeceptionWhenListFull() {
        List<Integer> list = new ArrayList<>(3);
        list.add(0, 1);
        list.add(0, 2);
        list.add(0, 3);
        list.add(0, 4);

    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldReturnExceptionWhenInvalidIndex() {
        List<Integer> list = new ArrayList<>(3);
        list.add(0, 1);
        list.add(1, 2);
        list.add(2, 3);
        list.remove(4);
    }
}
