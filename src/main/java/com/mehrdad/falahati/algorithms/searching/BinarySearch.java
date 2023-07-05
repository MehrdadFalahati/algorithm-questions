package com.mehrdad.falahati.algorithms.searching;

/**
 * leetcode number 704
 * <a href="https://leetcode.com/problems/binary-search/description/">leetcode704</a>
 */
public class BinarySearch {
    public int search(int[] nums, int target) {
        var left = 0;
        var right = nums.length - 1;
        while (left <= right) {
            var mid = (right + left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
