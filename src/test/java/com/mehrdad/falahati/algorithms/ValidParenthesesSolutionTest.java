package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesSolutionTest {

    @Test
    void test_is_valid_by_first_example() {
        var vp = new ValidParenthesesSolution();
        assertTrue(vp.isValid("(){}[]"));
    }

    @Test
    void test_is_valid_by_second_example() {
        var vp = new ValidParenthesesSolution();
        assertFalse(vp.isValid("(({]]{"));
    }

    @Test
    void test_is_valid_by_third_example() {
        var vp = new ValidParenthesesSolution();
        assertFalse(vp.isValid("(()"));
    }

}