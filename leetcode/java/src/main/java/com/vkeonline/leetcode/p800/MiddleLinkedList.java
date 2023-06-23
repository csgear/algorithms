package com.vkeonline.leetcode.p800;

/**
 * Leetcode [E]: 876. Middle of the Linked List
 * @author csgear
 */
public class MiddleLinkedList {
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
