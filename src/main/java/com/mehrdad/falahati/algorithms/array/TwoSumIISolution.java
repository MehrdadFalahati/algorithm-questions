package com.mehrdad.falahati.algorithms.array;

/**
 * leetcode number 167
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">leetcode167</a>
 */
public class TwoSumIISolution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        throw new IllegalStateException("can not find two sum");
    }
}
