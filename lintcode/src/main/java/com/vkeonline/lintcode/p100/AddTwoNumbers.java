package com.vkeonline.lintcode.p100;

import com.vkeonline.lintcode.common.ListNode;

/**
 * lintcode: #167, with Linked List
 */
public class AddTwoNumbers {
    public ListNode addLists(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode(0) ;
        ListNode curr = dummy ;

        int carry = 0;
        while(l1 != null && l2 != null) {
            int sum = (l1.val + l2.val + carry)   ;
            carry = sum / 10 ;
            ListNode node = new ListNode(sum % 10) ;
            curr.next = node ;
            curr = node ;
            l1 = l1.next ;
            l2 = l2.next ;
        }

        while(l1 != null) {
            int sum = (l1.val + carry) ;
            carry = sum / 10 ;
            ListNode node = new ListNode(sum % 10) ;
            curr.next = node ;
            curr = node ;
            l1 = l1.next ;
        }

        while(l2 != null) {
            int sum = (l2.val + carry)  ;
            carry = sum / 10 ;
            ListNode node = new ListNode(sum % 10) ;
            curr.next = node ;
            curr = node ;
            l2 = l2.next ;
        }

        if (carry != 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next ;
    }

}
