package com.vkeonline.leetcode.p100;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 138. Copy List with Random Pointer
 * @author csgear
 */
public class RandomNodeCopier {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> map = new HashMap<Node, Node>();
        Node cur = head;
        while (cur != null) {
            if (!map.containsKey(cur)) {
                map.put(cur, new Node(cur.val));
            }
            if (cur.next != null && !map.containsKey(cur.next)) {
                map.put(cur.next, new Node(cur.next.val));
            }
            if (cur.random != null && !map.containsKey(cur.random)) {
                map.put(cur.random, new Node(cur.random.val));
            }
            map.get(cur).random = map.get(cur.random);
            map.get(cur).next = map.get(cur.next);
            cur = cur.next;
        }
        return map.get(head);
    }
}
