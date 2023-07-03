package com.mehrdad.falahati.algorithms.trie;

/**
 * leetcode number 14
 * <a href="https://leetcode.com/problems/longest-common-prefix/description/">leetcode14</a>
 */
public class LongestCommonPrefixSolution {

    private final Trie trie;

    public LongestCommonPrefixSolution() {
        trie = new Trie();
    }

    public String longestCommonPrefix(String[] words) {
        if (words == null)
            return "";

        for (String word : words)
            trie.insert(word);

        var prefix = new StringBuilder();
        var maxChars = getShortest(words).length();
        var current = trie.root;
        while (prefix.length() < maxChars) {
            var children = current.getChildren();
            if (children.size() != 1)
                break;
            current = children.get(0);
            prefix.append(current.getValue());
        }

        return prefix.toString();
    }

    private String getShortest(String[] words) {
        if (words == null || words.length == 0)
            return "";

        var shortest = words[0];
        for (var word: words) {
            if (word.length() < shortest.length())
                shortest = word;
        }

        return shortest;
    }
}
