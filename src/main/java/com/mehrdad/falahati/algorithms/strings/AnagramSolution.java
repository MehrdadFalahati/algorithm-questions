package com.mehrdad.falahati.algorithms.strings;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramSolution {

    public List<String> getAnagrams(String text) {
        String[] words = text.split(" ");
        List<List<String>> result = new ArrayList<>();
        Map<String, String> isAnagramToMap = new HashMap<>();

        for(var word: words) {
            Words baseAndSortedText = getBaseAndSortedText(word);
            if(isAnagramToMap.containsKey(baseAndSortedText.sortedText())) {
                List<String> pair = getPairAnagrams(isAnagramToMap, baseAndSortedText);
                result.add(pair);
            }
            isAnagramToMap.put(baseAndSortedText.sortedText(), baseAndSortedText.baseText());
        }

        return result.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    private List<String> getPairAnagrams(Map<String, String> isAnagramToMap, Words baseAndSortedText) {
        List<String> pair = new ArrayList<>();
        pair.add(baseAndSortedText.baseText());
        pair.add(isAnagramToMap.get(baseAndSortedText.sortedText()));
        pair.sort((a, b) -> b.toLowerCase().compareTo(a.toLowerCase()));
        return pair;
    }

    private Words getBaseAndSortedText(String word) {
        String baseText = word.replaceAll("[^\\p{L}\\p{Nd}]", "");
        char[] baseCharacters = baseText.toLowerCase().toCharArray();
        Arrays.sort(baseCharacters);
        return new Words(baseText, new String(baseCharacters));
    }

    record Words(String baseText, String sortedText) {}
}
