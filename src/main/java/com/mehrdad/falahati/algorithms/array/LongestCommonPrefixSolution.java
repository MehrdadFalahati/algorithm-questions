package com.mehrdad.falahati.algorithms.array;
/**
 * leetcode number 14
 * <a href="https://leetcode.com/problems/longest-common-prefix/description/">leetcode14</a>
 */
public class LongestCommonPrefixSolution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
