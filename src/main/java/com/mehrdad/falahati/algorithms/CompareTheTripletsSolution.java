package com.mehrdad.falahati.algorithms;

import java.util.List;

/**
 * hackerrank
 * <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem?isFullScreen=true">hackerrank</a>
 */
public class CompareTheTripletsSolution {

    public List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int pointA = 0;
        int pointB = 0;
        for(var i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i))
                pointA++;
            else if (b.get(i) > a.get(i))
                pointB++;
        }
        return List.of(pointA, pointB);
    }
}
