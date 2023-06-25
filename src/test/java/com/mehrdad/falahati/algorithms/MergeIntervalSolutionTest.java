package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalSolutionTest {

    @Test
    void test_merge_interval_by_first_example() {
        var mi = new MergeIntervalSolution();
        int[][] actual = mi.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});

        assertArrayEquals(new int[][] {{1, 6}, {8, 10}, {15, 18}}, actual);
    }

    @Test
    void test_merge_interval_by_second_example() {
        var mi = new MergeIntervalSolution();
        int[][] actual = mi.merge(new int[][]{{1, 4}, {4, 5}});

        assertArrayEquals(new int[][] {{1, 5}}, actual);
    }

}