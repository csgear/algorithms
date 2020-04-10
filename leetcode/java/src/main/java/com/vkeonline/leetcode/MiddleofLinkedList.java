package com.vkeonline.leetcode;

public class MiddleofLinkedList {
    static class ListNode
    {
        int data;
        ListNode next;
        ListNode(int d)
        {
            data = d;
            next = null;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        if (head != null)
        {
            while (fast != null && fast.next != null)
            {
                fast = fast.next.next;
                slow = slow.next;
            }

        }
        return slow ;
    }
}
