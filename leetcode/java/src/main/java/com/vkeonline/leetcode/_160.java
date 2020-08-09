package com.vkeonline.leetcode;

import com.vkeonline.leetcode.common.ListNode;

public class _160 {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode a = headA, b = headB ;

            if(headA == null || headB == null) return null ;

            while(a != null && b != null) {
                if(a == b) return a ;
                a = a.next ;
                b = b.next ;

                // a == null && b == null to avoid infinite loop
                if(a == b) return a ;

                if( a == null) a = headB ;
                if( b == null) b = headA ;
            }
            return a ;
        }
    }
}
