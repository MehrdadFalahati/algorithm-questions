package com.mehrdad.falahati.algorithms.strings;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramSolutionTest {

    @Test
    void test_group_anagram_by_first_example() {
        var ga = new GroupAnagramSolution();
        List<List<String>> actual = ga.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertThat(actual)
                .isEqualTo(List.of(
                        List.of("eat", "tea", "ate"),
                        List.of("bat"),
                        List.of("tan", "nat")
                ));
    }

    @Test
    void test_group_anagram_by_second_example() {
        var ga = new GroupAnagramSolution();
        List<List<String>> actual = ga.groupAnagrams(new String[]{""});
        assertThat(actual)
                .isEqualTo(List.of(
                        List.of("")
                ));
    }

    @Test
    void test_group_anagram_by_third_example() {
        var ga = new GroupAnagramSolution();
        List<List<String>> actual = ga.groupAnagrams(new String[]{"a"});
        assertThat(actual)
                .isEqualTo(List.of(
                        List.of("a")
                ));
    }
}