package com.vkeonline.leetcode.p400;

import com.vkeonline.leetcode.common.Node;

/**
 * Leetcode [M]: 430. Flatten a Multilevel Doubly Linked List
 * @author csgear
 */
public class FlattenLinedList {
    public Node flatten(Node head) {
        if (head == null) {
            return null;
        }

        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node down = curr.child;
                while (down.next != null) {
                    down = down.next;
                }
                Node temp = curr.next;
                curr.next = curr.child;
                curr.child.prev = curr;
                curr.child = null;
                down.next = temp;
                if (temp != null) {
                    temp.prev = down;
                }
            }
            curr = curr.next;
        }
        return head;
    }

}
