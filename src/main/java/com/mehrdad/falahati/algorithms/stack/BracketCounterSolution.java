package com.mehrdad.falahati.algorithms.stack;

import java.util.Stack;

public class BracketCounterSolution {

    public int countBrackets(String words) {
        if (words == null || words.isEmpty())
            return -1;
        Stack<Character> stack = new Stack<>();
        int count = 0;
        for (var ch : words.toCharArray()) {
            if (indexOfBrackets(ch) == 1)
                stack.push(ch);
            else if (!stack.isEmpty() && (indexOfBrackets(stack.peek()) + 1) == indexOfBrackets(ch)) {
                stack.pop();
                count++;
            }
        }
        return count;
    }

    private int indexOfBrackets(char ch) {
        return switch (ch) {
            case '[' -> 1;
            case ']' -> 2;
            default -> -1;
        };
    }
}
