package com.mehrdad.falahati.algorithms.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    void test_binary_search_by_first_example() {
        var bs = new BinarySearch();
        assertEquals(4, bs.search(new int[]{-1,0,3,5,9,12}, 9));
    }

    @Test
    void test_binary_search_by_second_example() {
        var bs = new BinarySearch();
        assertEquals(-1, bs.search(new int[]{-1,0,3,5,9,12}, 2));
    }

    @Test
    void test_binary_search_by_third_example() {
        var bs = new BinarySearch();
        assertEquals(1, bs.search(new int[]{-1,0,3,5,9,12}, 0));
    }
}