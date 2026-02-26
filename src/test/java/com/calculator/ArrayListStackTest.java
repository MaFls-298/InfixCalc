package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.calculator.stack.ArrayListStack;

class ArrayListStackTest {

    @Test
    void testPushPop() {
        ArrayListStack<Integer> stack = new ArrayListStack<>();

        stack.push(10);
        stack.push(20);

        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    void testPeek() {
        ArrayListStack<String> stack = new ArrayListStack<>();

        stack.push("A");
        stack.push("B");

        assertEquals("B", stack.peek());
    }

    @Test
    void testIsEmpty() {
        ArrayListStack<Integer> stack = new ArrayListStack<>();
        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}