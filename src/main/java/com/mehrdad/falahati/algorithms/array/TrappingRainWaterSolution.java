package com.mehrdad.falahati.algorithms.array;

/**
 * leetcode number 49
 * <a href="https://leetcode.com/problems/trapping-rain-water/">leetcode49</a>
 */
public class TrappingRainWaterSolution {

    public int trap(int[] height) {
        int totalWater = 0;
        int left = 0;
        int right = height.length - 1;
        int maxLeft = 0, maxRight = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else{
                    totalWater += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else{
                    totalWater += maxRight - height[right];
                }
                right--;
            }
        }

        return totalWater;
    }
}
