package com.mehrdad.falahati.algorithms.strings;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode number 3
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">leetcode3</a>
 */
public class LongestSubstringWithoutRepeatingCharactersSolution {

    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();

        int longest = 0;
        Map<Character, Integer> seen = new HashMap<>();
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            if (seen.containsKey(current)) {
                Integer preSeen = seen.get(current);
                if (preSeen >= left) {
                    left = preSeen + 1;
                }
            }
            seen.put(current, right);
            longest = Math.max(longest, (right - left + 1));
        }
        return longest;
    }
}
