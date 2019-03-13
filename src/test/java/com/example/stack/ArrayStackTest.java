package com.example.stack;

import org.junit.Test;

public class ArrayStackTest {

    @Test
    public void AddElement_Successful() {
        ArrayStack<Integer> stack = new ArrayStack<>(5);
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }


    @Test(expected = IllegalStateException.class)
    public void AddMoreThanCapacity() {
       ArrayStack<Integer> s = new ArrayStack<>(3);
       s.push(10);
       s.push(11);
       s.push(12);
       s.push(13);
    }
}
