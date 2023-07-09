package com.mehrdad.falahati.algorithms.linkedlist;

public class MergeTwoSortedListsSolution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        var root = new ListNode();
        var pre = root;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                pre.next = l2;
                l2 = l2.next;
            } else {
                pre.next = l1;
                l1 = l1.next;
            }
            pre = pre.next;
        }
        pre.next = l1 != null ? l1 : l2;
        return root.next;
    }

    public ListNode mergeTwoListsRecursive(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val < list2.val) {
            list1.next = mergeTwoListsRecursive(list1.next, list2);
            return list1;
        }
        list2.next = mergeTwoListsRecursive(list1, list2.next);
        return list2;
    }
}
