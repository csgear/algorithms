package com.vkeonline.leetcode.year2020.nov;

import com.vkeonline.leetcode.common.ListNode;

/**
 * @author csgear
 */
public class ConvertBinaryNumber {
    public int getDecimalValue(ListNode head) {
        int result = 0 ;

        while(head != null) {
            result = result << 1 | head.val ;
            head = head.next ;
        }

        return result ;
    }
}
