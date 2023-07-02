package com.mehrdad.falahati.algorithms.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersSolutionTest {

    @Test
    void test_longest_substring_by_first_example() {
        var lswrch = new LongestSubstringWithoutRepeatingCharactersSolution();
        assertEquals(3, lswrch.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test_longest_substring_by_second_example() {
        var lswrch = new LongestSubstringWithoutRepeatingCharactersSolution();
        assertEquals(3, lswrch.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void test_longest_substring_by_third_example() {
        var lswrch = new LongestSubstringWithoutRepeatingCharactersSolution();
        assertEquals(1, lswrch.lengthOfLongestSubstring("bbbbb"));
    }

}