package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.common.ListNode;

/**
 * lintcode: 35. Reverse Linked List
 * @author csgear
 */
public class ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
