package com.mehrdad.falahati.algorithms.linkedlist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class MergeTwoSortedListsSolutionTest {

    private LinkedList l1;
    private LinkedList l2;

    @BeforeEach
    void init() {
        l1 = new LinkedList();
        l2 = new LinkedList();

        l1.addFirst(4);
        l1.addFirst(2);
        l1.addFirst(1);

        l2.addFirst(4);
        l2.addFirst(3);
        l2.addFirst(1);
    }

    @Test
    void test_merge_two_sorted_lists_by_first_example() {
        var mtsl = new MergeTwoSortedListsSolution();
        var mergedNode1 = mtsl.mergeTwoLists(l1.getHead(), l2.getHead());
        var mergedList1 = LinkedList.toList(mergedNode1);

        assertThat(mergedList1)
                .isEqualTo(List.of(1,1,2,3,4,4));
    }

    @Test
    void test_merge_two_sorted_lists_recursive_by_first_example() {
        var mtsl = new MergeTwoSortedListsSolution();
        var mergedNode2 = mtsl.mergeTwoListsRecursive(l1.getHead(), l2.getHead());
        var mergedList2 = LinkedList.toList(mergedNode2);

        assertThat(mergedList2)
                .isEqualTo(List.of(1,1,2,3,4,4));
    }
}