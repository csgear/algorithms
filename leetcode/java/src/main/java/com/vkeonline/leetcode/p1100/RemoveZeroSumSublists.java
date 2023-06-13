

package com.vkeonline.leetcode.p1100;

import java.util.HashMap;
import java.util.Map;

import com.vkeonline.leetcode.common.ListNode;

/**
 * Leetcode [M]: 1171. Remove Zero Sum Consecutive Nodes from Linked List
 * @author csgear
 */
public class RemoveZeroSumSublists {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0) ;
        dummy.next = head ;
        Map<Integer, ListNode> map = new HashMap<>() ;

        int prefixSum = 0 ;

        while (head != null) {
            prefixSum += head.val ;
            map.put(prefixSum, head) ;
            head = head.next ;
        }

        prefixSum = 0 ;

        for (ListNode node = dummy; node != null; node = node.next) {
            prefixSum += node.val;
            node.next = map.get(prefixSum).next;
        }

        return dummy.next ;
    }
}
