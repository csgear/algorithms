package com.vkeonline.leetcode.year2020.oct;

import com.vkeonline.leetcode.common.ListNode;

/**
 * @author csgear
 */
public class RotateList {
    private int getLength(ListNode node) {
        int result = 0;
        while (node != null) {
            node = node.next;
            result++;
        }
        return result;
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = getLength(head);
        if (length == 1) {
            return head;
        }
        k %= length;
        if (k == 0) {
            return head;
        }

        ListNode node = head;
        for (int i = 0; i < length - k - 1; i++) {
            node = node.next;
        }
        ListNode newHead = node.next, newTail = node;

        while (node.next != null) {
            node = node.next;
        }

        node.next = head;
        newTail.next = null;
        return newHead;
    }
}
