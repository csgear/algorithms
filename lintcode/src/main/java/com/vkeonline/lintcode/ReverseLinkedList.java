package com.vkeonline.lintcode;

import com.vkeonline.lintcode.common.ListNode;

public class ReverseLinkedList {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            //temp记录下一个节点，head是当前节点
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
