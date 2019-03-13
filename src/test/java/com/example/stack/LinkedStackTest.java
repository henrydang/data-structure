package com.example.stack;

import org.junit.Test;

public class LinkedStackTest {


    @Test
    public void AddAndRemoveElement() {
        Stack<Integer> s = new LinkedStack<>();
        s.push(10);
        s.push(11);
        s.push(12);
        System.out.println("size:" + s.size());
        System.out.println(s.pop());
        System.out.println("size:" + s.size());
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
