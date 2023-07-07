package com.mehrdad.falahati.algorithms.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerSolutionTest {

    @Test
    void test_reverse_integer_by_first_example() {
        var ri = new ReverseIntegerSolution();
        assertEquals(321, ri.reverse(123));
    }

    @Test
    void test_reverse_integer_by_second_example() {
        var ri = new ReverseIntegerSolution();
        assertEquals(-321, ri.reverse(-123));
    }

    @Test
    void test_reverse_integer_by_third_example() {
        var ri = new ReverseIntegerSolution();
        assertEquals(21, ri.reverse(120));
    }
}