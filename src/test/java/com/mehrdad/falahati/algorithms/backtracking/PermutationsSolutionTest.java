package com.mehrdad.falahati.algorithms.backtracking;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PermutationsSolutionTest {

    @Test
    void test_permute_by_first_example() {
        var perm = new PermutationsSolution();
        List<List<Integer>> permuted = perm.permute(new int[]{1, 2, 3});
        assertThat(permuted)
                .isEqualTo(List.of(List.of(1,2,3), List.of(1,3,2), List.of(2,1,3),
                        List.of(2,3,1), List.of(3,2,1), List.of(3,1,2)));
    }

    @Test
    void test_permute_by_second_example() {
        var perm = new PermutationsSolution();
        List<List<Integer>> permuted = perm.permute(new int[]{0, 1});
        assertThat(permuted)
                .isEqualTo(List.of(List.of(0, 1), List.of(1, 0)));
    }

    @Test
    void test_permute_by_third_example() {
        var perm = new PermutationsSolution();
        List<List<Integer>> permuted = perm.permute(new int[]{1});
        assertThat(permuted)
                .isEqualTo(List.of(List.of(1)));
    }
}