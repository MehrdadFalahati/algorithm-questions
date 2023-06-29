package com.mehrdad.falahati.algorithms.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackSolutionTest {

    @Test
    void test_min_stack_by_first_example() {
        var minStack = new MinStackSolution();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(-2, minStack.getMin());
    }
}