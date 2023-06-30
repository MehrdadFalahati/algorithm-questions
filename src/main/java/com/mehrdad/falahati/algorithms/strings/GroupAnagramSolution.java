package com.mehrdad.falahati.algorithms.strings;

import java.util.*;

/**
 * leetcode number 49
 * <a href="https://leetcode.com/problems/group-anagrams/description/">leetcode49</a>
 */
public class GroupAnagramSolution {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }
        res.addAll(map.values());
        return res;
    }
}
