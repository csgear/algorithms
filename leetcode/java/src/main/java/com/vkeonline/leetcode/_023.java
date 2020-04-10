package com.vkeonline.leetcode;


import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */


public class _023 {
    public class Solution {
        public ListNode mergeKLists(ListNode[] lists) {

            PriorityQueue<ListNode> pq = new PriorityQueue<>(
                    Comparator.comparingInt((ListNode o) -> o.val));

            ListNode head = null, tail = null;

            for (ListNode node : lists) {
                if (node != null) pq.offer(node);
            }

            while (!pq.isEmpty()) {
                ListNode top = pq.peek();
                pq.poll();

                if (top.next != null) pq.offer(top.next);

                if (head == null) {
                    head = top;
                    tail = top;
                } else {
                    tail.next = top;
                    tail = top;
                }
            }

            return head;
        }
    }
}
