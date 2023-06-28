package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterSolutionTest {

    @Test
    void test_trap_by_first_example() {
        var trw = new TrappingRainWaterSolution();
        assertEquals(6, trw.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    @Test
    void test_trap_by_second_example() {
        var trw = new TrappingRainWaterSolution();
        assertEquals(9, trw.trap(new int[] {4,2,0,3,2,5}));
    }

}