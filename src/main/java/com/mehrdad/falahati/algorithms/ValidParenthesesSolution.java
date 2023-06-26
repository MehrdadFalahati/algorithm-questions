package com.mehrdad.falahati.algorithms;

import java.util.Stack;

/**
 * leetcode number 20
 * <a href="https://leetcode.com/problems/valid-parentheses/description/">leetcode20</a>
 */
public class ValidParenthesesSolution {

    public boolean isValid(String s) {
        if (s.isEmpty()) return true;
        if (isOdd(s.length())) return false;
        Stack<Character> stack = new Stack<>();
        for (char ch: s.toCharArray()) {
            if (isOdd(indexCharacter(ch)))
                stack.push(ch);
            else if (!stack.isEmpty() && (indexCharacter(stack.peek()) + 1) == indexCharacter(ch))
                stack.pop();
            else
                stack.push(ch);
        }
        return stack.isEmpty();
    }

    private int indexCharacter(char c) {
        return switch (c) {
            case '(' -> 1;
            case ')' -> 2;
            case '{' -> 3;
            case '}' -> 4;
            case '[' -> 5;
            case ']' -> 6;
            default -> 0;
        };
    }

    private boolean isOdd(int num) {
        return num % 2 != 0;
    }
}
