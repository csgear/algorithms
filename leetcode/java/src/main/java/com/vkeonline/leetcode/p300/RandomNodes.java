package com.vkeonline.leetcode.p300;

import com.vkeonline.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Leetcode [M]: 382. Linked List Random Node
 * @author csgear
 */
public class RandomNodes {
    List<Integer> nodes = new ArrayList<>();
    public RandomNodes(ListNode head) {
        while(head != null) {
            nodes.add(head.val) ;
            head = head.next ;
        }
    }


    public int getRandom() {
        int index = (int) ( Math.random() * nodes.size() ) ;
        return nodes.get(index) ;
    }
}
