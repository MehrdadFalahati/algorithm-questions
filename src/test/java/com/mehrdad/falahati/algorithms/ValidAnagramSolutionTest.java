package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramSolutionTest {

    @Test
    void test_is_anagram_by_first_example() {
        var va = new ValidAnagramSolution();
        assertTrue(va.isAnagram("anagram", "nagaram"));
    }

    @Test
    void test_is_anagram_by_second_example() {
        var va = new ValidAnagramSolution();
        assertFalse(va.isAnagram("rat", "car"));
    }

}