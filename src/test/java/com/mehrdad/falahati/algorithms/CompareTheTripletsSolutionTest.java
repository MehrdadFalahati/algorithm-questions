package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompareTheTripletsSolutionTest {

    @Test
    public void test_compare_triplets_by_first_example() {
        var ct = new CompareTheTripletsSolution();
        List<Integer> actual = ct.compareTriplets(List.of(1, 2, 3), List.of(3, 2, 1));
        assertEquals(1, actual.get(0));
        assertEquals(1, actual.get(1));
    }

    @Test
    public void test_compare_triplets_by_second_example() {
        var ct = new CompareTheTripletsSolution();
        List<Integer> actual = ct.compareTriplets(List.of(17, 28, 30), List.of(99, 16, 8));
        assertEquals(2, actual.get(0));
        assertEquals(1, actual.get(1));
    }

}