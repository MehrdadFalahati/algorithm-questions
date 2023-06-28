package com.mehrdad.falahati.algorithms.array;

import java.util.HashSet;
import java.util.Set;

/**
 * leetcode number 217
 * <a href="https://leetcode.com/problems/contains-duplicate/description/">leetcode217</a>
 */
public class ContainsDuplicateSolution {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null)
            return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
