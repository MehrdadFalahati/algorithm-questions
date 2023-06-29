package com.mehrdad.falahati.algorithms.stack;

import java.util.Stack;

/**
 * leetcode number 155
 * <a href="https://leetcode.com/problems/min-stack/description/">leetcode155</a>
 */
public class MinStackSolution {

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStackSolution() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

        int min = Math.min(val, minStack.isEmpty() ? val : minStack.peek());
        minStack.push(min);
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
