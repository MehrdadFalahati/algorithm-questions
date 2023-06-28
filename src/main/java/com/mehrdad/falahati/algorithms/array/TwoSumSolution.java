package com.mehrdad.falahati.algorithms.array;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode number one
 * <a href="https://leetcode.com/problems/two-sum/description/">leetcode1</a>
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
