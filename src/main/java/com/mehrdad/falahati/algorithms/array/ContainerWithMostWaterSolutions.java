package com.mehrdad.falahati.algorithms.array;

/**
 * leetcode number 11
 * <a href="https://leetcode.com/problems/container-with-most-water/">leetcode11</a>
 */
public class ContainerWithMostWaterSolutions {

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if (height[left] <= height[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
