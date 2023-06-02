package com.vkeonline.leetcode.p300;

import com.vkeonline.leetcode.common.ListNode;

/**
 * Leetcode [M]: 328. Odd Even Linked List
 * @author csgear
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
        {
            return head;
        }

        ListNode oddHead = new ListNode(), oddEnd = oddHead,
                evenHead = new ListNode(), evenEnd = evenHead;

        ListNode curr = head;
        int count = 1;
        while (curr != null) {
            if (count % 2 == 1) {
                oddEnd.next = curr;
                oddEnd = oddEnd.next;
            }
            else {
                evenEnd.next = curr ;
                evenEnd = evenEnd.next ;
            }
            curr = curr.next ;
            count++ ;
        }

        oddEnd.next = evenHead.next ;
        evenEnd.next = null ;

        return oddHead.next ;
    }
}
