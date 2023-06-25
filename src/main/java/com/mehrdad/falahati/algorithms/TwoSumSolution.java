package com.mehrdad.falahati.algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode number one
 * https://leetcode.com/problems/two-sum/description/
 */
public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var index = 0; index < nums.length; index++) {
            int secondElement = target - nums[index];
            if (map.containsKey(secondElement)) {
                return new int[] {map.get(secondElement), index};
            }
            map.put(nums[index], index);
        }
        throw new IllegalStateException("Can not find tow sum in array");
    }
}
