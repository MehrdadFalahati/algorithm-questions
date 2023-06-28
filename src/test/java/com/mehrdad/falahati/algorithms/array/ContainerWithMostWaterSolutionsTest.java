package com.mehrdad.falahati.algorithms.array;

import com.mehrdad.falahati.algorithms.array.ContainerWithMostWaterSolutions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterSolutionsTest {

    @Test
    void test_max_area_by_first_example() {
        var cwmw = new ContainerWithMostWaterSolutions();
        assertEquals(49, cwmw.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
    }

    @Test
    void test_max_area_by_second_example() {
        var cwmw = new ContainerWithMostWaterSolutions();
        assertEquals(1, cwmw.maxArea(new int[] {1,1}));
    }
}