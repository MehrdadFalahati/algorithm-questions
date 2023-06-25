package com.mehrdad.falahati.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateSolutionTest {

    @Test
    void test_contains_duplicate_by_first_example() {
        var cd = new ContainsDuplicateSolution();
        assertTrue(cd.containsDuplicate(new int[]{1,2,3,4,1}));
    }

    @Test
    void test_contains_duplicate_by_second_example() {
        var cd = new ContainsDuplicateSolution();
        assertFalse(cd.containsDuplicate(new int[]{1,2,3,4}));
    }

}