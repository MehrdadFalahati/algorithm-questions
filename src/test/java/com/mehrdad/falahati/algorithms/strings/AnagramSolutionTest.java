package com.mehrdad.falahati.algorithms.strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AnagramSolutionTest {

    @Test
    public void test_get_anagrams_by_first_example() {
        var an = new AnagramSolution();
        List<String> anagrams = an.getAnagrams("Words are an era sword?");
        assertThat(anagrams)
                .isEqualTo(List.of("era", "are", "Words", "sword"));
    }
}