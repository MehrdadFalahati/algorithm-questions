package com.mehrdad.falahati.algorithms.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerSolutionTest {

    @Test
    void test_roman_to_integer_by_first_example() {
        var ri = new RomanToIntegerSolution();
        assertEquals(3, ri.romanToInt("III"));
    }

    @Test
    void test_roman_to_integer_by_second_example() {
        var ri = new RomanToIntegerSolution();
        assertEquals(58, ri.romanToInt("LVIII"));
    }

    @Test
    void test_roman_to_integer_by_third_example() {
        var ri = new RomanToIntegerSolution();
        assertEquals(1994, ri.romanToInt("MCMXCIV"));
    }
}