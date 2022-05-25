package com.vkeonline.leetcode.p2100;

import com.vkeonline.leetcode.common.ListNode;

import java.util.ArrayDeque;

public class MaximumTwinSumLinkedList {
    public int pairSum(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        fastPtr = fastPtr.next;

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(slowPtr.val);

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            stack.push(slowPtr.val);
            fastPtr = fastPtr.next.next;
        }

        int answer = Integer.MIN_VALUE;
        slowPtr = slowPtr.next;
        while (slowPtr != null) {
            answer = Math.max(answer, slowPtr.val + stack.peek());
            stack.pop();
            slowPtr = slowPtr.next;
        }

        return answer;
    }
}
