package com.mehrdad.falahati.algorithms.stack;

import com.mehrdad.falahati.algorithms.stack.BracketCounterSolution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketCounterSolutionTest {

    @Test
    void test_count_brackets_by_first_example() {
        var bc = new BracketCounterSolution();
        assertEquals(1, bc.countBrackets("you can find this [it is a test]"));
    }

    @Test
    void test_count_brackets_by_second_example() {
        var bc = new BracketCounterSolution();
        assertEquals(3, bc.countBrackets("you can [find] this [[it is a test]]"));
    }

    @Test
    void test_count_brackets_by_third_example() {
        var bc = new BracketCounterSolution();
        assertEquals(3, bc.countBrackets("you can [[find] this [[it is a test]]"));
    }

    @Test
    void test_count_brackets_by_forth_example() {
        var bc = new BracketCounterSolution();
        assertEquals(0, bc.countBrackets("[[["));
    }
}