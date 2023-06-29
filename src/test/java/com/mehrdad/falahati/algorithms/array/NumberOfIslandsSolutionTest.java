package com.mehrdad.falahati.algorithms.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsSolutionTest {

    @Test
    void test_number_of_island_by_first_example() {
        var noi = new NumberOfIslandsSolution();
        var actual = noi.numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        });
        assertEquals(1, actual);
    }

    @Test
    void test_number_of_island_by_second_example() {
        var noi = new NumberOfIslandsSolution();
        var actual = noi.numIslands(new char[][]{
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        });
        assertEquals(3, actual);
    }
}