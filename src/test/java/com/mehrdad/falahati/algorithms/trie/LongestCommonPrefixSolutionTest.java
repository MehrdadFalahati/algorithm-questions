package com.mehrdad.falahati.algorithms.trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixSolutionTest {

    @Test
    void test_longest_common_prefix_by_first_example() {
        var lcp = new LongestCommonPrefixSolution();
        assertEquals("fl", lcp.longestCommonPrefix(new String[] {"flower","flow","flight"}));
    }

    @Test
    void test_longest_common_prefix_by_second_example() {
        var lcp = new LongestCommonPrefixSolution();
        assertEquals("", lcp.longestCommonPrefix(new String[] {"dog","racecar","car"}));
    }
}