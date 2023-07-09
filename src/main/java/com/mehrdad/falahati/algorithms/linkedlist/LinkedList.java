package com.mehrdad.falahati.algorithms.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private ListNode head;
    private ListNode last;
    private int size = 0;

    public void addFirst(int value) {
        size++;
        if (head == null) {
            var node = new ListNode(value);
            this.head = node;
            this.last = node;
            return;
        }
        var currentNode = new ListNode(value);
        currentNode.next = head;
        head = currentNode;
    }

    public ListNode getHead() {
        return head;
    }

    public ListNode getLast() {
        return last;
    }

    public int size() {
        return size;
    }

    public int[] toArray(ListNode head) {
        int[] array = new int[size];
        var current = head;
        int index = 0;
        while (current != null) {
            array[index++] = current.val;
            current = current.next;
        }
        return array;
    }

    public static List<Integer> toList(ListNode head) {
        List<Integer> list = new ArrayList<>();
        var current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        return list;
    }
}
