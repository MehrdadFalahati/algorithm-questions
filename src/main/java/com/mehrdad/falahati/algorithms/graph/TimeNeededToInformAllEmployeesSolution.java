package com.mehrdad.falahati.algorithms.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * leetcode number 1376
 * <a href="https://leetcode.com/problems/time-needed-to-inform-all-employees/">leetcode1376</a>
 */
public class TimeNeededToInformAllEmployeesSolution {

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        for (int i = 0; i < n; i++)
            adjacencyList.putIfAbsent(i, new ArrayList<>());
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] == -1)
                continue;
            adjacencyList.get(manager[i]).add(i);
        }
        return depthFist(headID, informTime, adjacencyList);
    }

    private int depthFist(int currentId, int[] informTime, Map<Integer, List<Integer>> adjacencyList) {
        if (adjacencyList.get(currentId).size() == 0) {
            return 0;
        }
        int max = 0;
        for (var subordinate : adjacencyList.get(currentId))
            max = Math.max(max, depthFist(subordinate, informTime, adjacencyList));
        return max + informTime[currentId];
    }
}
