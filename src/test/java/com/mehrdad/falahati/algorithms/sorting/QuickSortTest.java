package com.mehrdad.falahati.algorithms.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void test_selection_sort() {
        var sorted = new QuickSort();
        int[] arrays = {8, 5, 4, 2, 7, 1, 6, 3};
        sorted.sort(arrays);
        assertArrayEquals(new int[] {1,2,3,4,5,6,7,8}, arrays);
    }
}