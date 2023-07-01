package com.mehrdad.falahati.algorithms.linkedlist;

/**
 * leetcode number 92
 * <a href="https://leetcode.com/problems/reverse-linked-list-ii/description/">leetcode92</a>
 */
public class ReverseLinkedListIISolution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null) return null;
        int currnetPosition = 1;
        var current = head;
        var startNode = head;
        while (currnetPosition < left) {
            startNode = current;
            current = current.next;
            currnetPosition++;
        }

        var tail = current;
        ListNode newList = null;
        while (currnetPosition >= left && currnetPosition <= right) {
            var next = current.next;
            current.next = newList;
            newList = current;
            current = next;
            currnetPosition++;
        }
        startNode.next = newList;
        tail.next = current;
        if (left > 1)
            return head;
        return newList;
    }
}
