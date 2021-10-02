
package com.vkeonline.leetcode.p000;

import com.vkeonline.leetcode.common.ListNode;


/**
 * Leetcode [M]: 82. Remove Duplicates from Sorted List II
 * @author csgear
 */
public class RemoveDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head) ;
        ListNode current = head, prev = dummy ;

        // loop invariance, prev->next and no duplicates in between
        while(current != null) {
            if(current.next != null && current.val == current.next.val) {
                while(current.next != null && current.val == current.next.val) {
                    current = current.next ;
                }
                prev.next = current.next ;
            }
            else {
                prev = prev.next ;
            }
            current = current.next ;
        }
        return dummy.next ;
    }
}
