package com.mehrdad.falahati.algorithms.linkedlist;

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
}
