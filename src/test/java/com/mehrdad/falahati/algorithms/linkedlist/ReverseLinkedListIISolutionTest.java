package com.mehrdad.falahati.algorithms.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListIISolutionTest {

    @Test
    void test_reverse_linked_list_by_first_example() {
        var linkedList = new LinkedList();
        linkedList.addFirst(5);
        linkedList.addFirst(4);
        linkedList.addFirst(3);
        linkedList.addFirst(2);
        linkedList.addFirst(1);
        var reverse = new ReverseLinkedListIISolution();
        ListNode reverseListNode = reverse.reverseBetween(linkedList.getHead(), 2, 4);
        assertArrayEquals(new int[] {1,4,3,2,5}, linkedList.toArray(reverseListNode));
    }

    @Test
    void test_reverse_linked_list_by_second_example() {
        var linkedList = new LinkedList();
        linkedList.addFirst(5);
        var reverse = new ReverseLinkedListIISolution();
        ListNode reverseListNode = reverse.reverseBetween(linkedList.getHead(), 1, 1);
        assertArrayEquals(new int[] {5}, linkedList.toArray(reverseListNode));
    }
}