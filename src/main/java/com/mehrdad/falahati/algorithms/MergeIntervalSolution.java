package com.mehrdad.falahati.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * leetcode number 56
 * <a href="https://leetcode.com/problems/merge-intervals/description/">leetcode56</a>
 */
public class MergeIntervalSolution {

    public int[][] merge(int[][] interval) {
        List<int[]> result = new ArrayList<>();

        Arrays.sort(interval, Comparator.comparingInt(a -> a[0]));

        result.add(interval[0]);
        for(var i = 1; i < interval.length; i++) {
            var lastIndex = result.size() - 1;
            if (result.get(lastIndex)[1] >= interval[i][0]) {
                result.get(lastIndex)[1] =
                        Math.max(result.get(lastIndex)[1], interval[i][1]);
            } else {
                result.add(interval[i]);
            }
        }

        int[][] answer = new int[result.size()][2];
        result.toArray(answer);
        return answer;
    }
}
