package com.vkeonline.leetcode;

import com.vkeonline.leetcode.common.ListNode;

/**
 * @author csgear
 * leetcode: 19. Remove Nth Node From End of List
 */
class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        for (int i = 0; i < n; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }

        ListNode beforeDelete = dummy;
        while (head != null) {
            head = head.next;
            beforeDelete = beforeDelete.next;
        }

        if (beforeDelete != null) {
            beforeDelete.next = beforeDelete.next.next;
        }

        return dummy.next;
    }
}

