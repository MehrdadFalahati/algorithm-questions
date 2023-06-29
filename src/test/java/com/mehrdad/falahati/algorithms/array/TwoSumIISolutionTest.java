package com.mehrdad.falahati.algorithms.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIISolutionTest {

    @Test
    void test_two_sum_by_first_example() {
        var ts = new TwoSumIISolution();
        assertArrayEquals(new int[] {1, 2}, ts.twoSum(new int[] {2,7,11,15}, 9));
    }

    @Test
    void test_two_sum_by_second_example() {
        var ts = new TwoSumIISolution();
        assertArrayEquals(new int[] {1, 2}, ts.twoSum(new int[] {-1,0}, -1));
    }

    @Test
    void test_two_sum_by_third_example() {
        var ts = new TwoSumIISolution();
        assertArrayEquals(new int[] {1, 3}, ts.twoSum(new int[] {2,3,4}, 6));
    }
}