package com.mehrdad.falahati.algorithms;

import java.util.Arrays;

/**
 * leetcode number 242
 * <a href="https://leetcode.com/problems/valid-anagram/description/">leetcode242</a>
 */
public class ValidAnagramSolution {
    public boolean isAnagram(String s, String t) {
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        s = new String(first);
        t = new String(second);
        return s.equals(t);
    }
}
