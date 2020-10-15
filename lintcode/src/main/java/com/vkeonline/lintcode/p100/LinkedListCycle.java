package com.vkeonline.lintcode.p100;

import com.vkeonline.lintcode.common.ListNode;

/**
 * LintCode: 102. Linked List Cycle
 * @author csgear
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast, slow;
        fast = head.next;
        slow = head;
        while (fast != slow) {
            if(fast==null || fast.next==null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;
    }
}
