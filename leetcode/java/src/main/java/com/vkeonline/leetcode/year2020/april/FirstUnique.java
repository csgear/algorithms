package com.vkeonline.leetcode.year2020.april;

import java.util.*;

public class FirstUnique {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int num) {
            this.val = num;
            next = null;
        }
    }

    private final Map<Integer, ListNode> numToPrev = new HashMap<>();
    private final ListNode header = new ListNode(0);
    private ListNode tail = header;
    private final Set<Integer> duplicates = new HashSet<>();

    public FirstUnique(int[] nums) {
        for (var num : nums) {
            add(num);
        }
    }

    private void remove(int number) {
        ListNode prev = numToPrev.get(number);
        prev.next = prev.next.next;
        numToPrev.remove(number);

        // change tail and prev of next
        if (prev.next != null) {
            numToPrev.put(prev.next.val, prev);
        } else {
            tail = prev;
        }
    }

    public void add(int number) {
        if (duplicates.contains(number)) {
            return;
        }

        if (numToPrev.containsKey(number)) {
            remove(number);
            duplicates.add(number);
        } else {
            ListNode node = new ListNode(number);
            numToPrev.put(number, tail);
            tail.next = node;
            tail = node;
        }
    }

    public int showFirstUnique() {
        if (header.next != null) {
            return header.next.val;
        }
        return -1;
    }
}
