package com.mehrdad.falahati.algorithms.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode number 46
 * <a href="https://leetcode.com/problems/permutations/description/">leetcode46</a>
 */
public class PermutationsSolution {
    public List<List<Integer>> permute(int[] nums) {
        return permute(nums, 0);
    }

    private List<List<Integer>> permute(int[] nums, int start) {
        List<List<Integer>> result = new ArrayList<>();
        if (start == nums.length) {
            List<Integer> perms = new ArrayList<>();
            for (int num : nums) perms.add(num);
            result.add(perms);
            return result;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            result.addAll(permute(nums, start + 1));
            swap(nums, start, i);
        }

        return result;
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
