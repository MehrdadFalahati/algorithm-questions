package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumSolutionTest {

    @Test
    void test_towSum_by_first_example() {
        var lc = new TwoSumSolution();
        int[] actual = lc.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0,1}, actual);
    }

    @Test
    void test_towSum_by_second_example() {
        var lc = new TwoSumSolution();
        int[] actual = lc.twoSum(new int[]{3,2,4}, 6);

        assertArrayEquals(new int[]{1,2}, actual);
    }

    @Test
    void test_towSum_by_third_example() {
        var lc = new TwoSumSolution();
        int[] actual = lc.twoSum(new int[]{3,3}, 6);

        assertArrayEquals(new int[]{0,1}, actual);
    }

}