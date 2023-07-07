package com.mehrdad.falahati.algorithms.math;

/**
 * leetcode number 7
 * <a href="https://leetcode.com/problems/reverse-integer/description/">leetcode7</a>
 */
public class ReverseIntegerSolution {
    public int reverse(int x) {
        int reverse = 0;
        while (x != 0) {
            int pop = x % 10;
            x = x / 10;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10;
            reverse = reverse + pop;
        }
        return reverse;
    }
}
