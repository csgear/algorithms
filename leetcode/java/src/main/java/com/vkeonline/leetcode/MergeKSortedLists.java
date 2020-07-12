package com.vkeonline.leetcode;


import com.vkeonline.leetcode.common.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author csgear
 * leetcode: Merge k Sorted Lists
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> pq = new PriorityQueue<>(
                Comparator.comparingInt((ListNode o) -> o.val));

        ListNode head = null, tail = null;

        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        while (!pq.isEmpty()) {
            ListNode top = pq.peek();
            pq.poll();

            if (top.next != null) {
                pq.offer(top.next);
            }

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

