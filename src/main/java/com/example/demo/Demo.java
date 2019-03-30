package com.example.demo;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ListIterator<Integer> iter = list.listIterator();
        while (iter.hasNext()) {
            iter.set(iter.next() * 2);
        }
        System.out.println(list);
    }
}
