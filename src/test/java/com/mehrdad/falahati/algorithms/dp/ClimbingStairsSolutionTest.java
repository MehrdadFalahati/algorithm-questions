package com.mehrdad.falahati.algorithms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsSolutionTest {

    @Test
    void test_clim_stairs_by_first_example() {
        var cs = new ClimbingStairsSolution();
        assertEquals(2, cs.climbStairs(2));
    }

    @Test
    void test_clim_stairs_by_second_example() {
        var cs = new ClimbingStairsSolution();
        assertEquals(3, cs.climbStairs(3));
    }

    @Test
    void test_clim_stairs_by_third_example() {
        var cs = new ClimbingStairsSolution();
        assertEquals(89, cs.climbStairs(10));
    }

    @Test
    void test_clim_stairs_by_forth_example() {
        var cs = new ClimbingStairsSolution();
        assertEquals(10946, cs.climbStairs(20));
    }
}