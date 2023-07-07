package com.mehrdad.falahati.algorithms.math;

/**
 * leetcode number 13
 * <a href="https://leetcode.com/problems/roman-to-integer/description/">leetcode13</a>
 */
public class RomanToIntegerSolution {

    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char roman = s.charAt(i);
            int num1 = value(roman);
            if (i + 1 < s.length()) {
                int num2 = value(s.charAt(i + 1));
                if (num1 >= num2) {
                    result += num1;
                } else {
                    result = result + num2 - num1;
                    i++;
                }
            } else {
                result += num1;
                i++;
            }
        }
        return result;
    }

    private int value(char roman) {
        return switch (roman) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
