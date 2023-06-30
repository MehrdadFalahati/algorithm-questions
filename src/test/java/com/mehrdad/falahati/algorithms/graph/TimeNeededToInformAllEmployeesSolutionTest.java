package com.mehrdad.falahati.algorithms.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeNeededToInformAllEmployeesSolutionTest {

    @Test
    void test_numOfMinutes_by_first_example() {
        var timeToNeedInformAll = new TimeNeededToInformAllEmployeesSolution();
        assertEquals(0, timeToNeedInformAll.numOfMinutes(1, 0, new int[] {-1}, new int[] {0}));
    }

    @Test
    void test_numOfMinutes_by_second_example() {
        var timeToNeedInformAll = new TimeNeededToInformAllEmployeesSolution();
        assertEquals(1, timeToNeedInformAll.numOfMinutes(6, 2, new int[] {2,2,-1,2,2,2}, new int[] {0,0,1,0,0,0}));
    }

    @Test
    void test_numOfMinutes_by_third_example() {
        var timeToNeedInformAll = new TimeNeededToInformAllEmployeesSolution();
        assertEquals(2, timeToNeedInformAll.numOfMinutes(6, 2, new int[] {3,3,-1,2,3,3}, new int[] {3,4,1,1,6,2}));
    }

}