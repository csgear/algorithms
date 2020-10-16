package com.vkeonline.leetcode.p100;

import java.util.HashMap;
import java.util.Map;

public class _138 {
    class Solution {
        class Node {
            public int val;
            public Node next;
            public Node random;

            public Node() {}

            public Node(int _val,Node _next,Node _random) {
                val = _val;
                next = _next;
                random = _random;
            }
        };

        public Node copyRandomList(Node head) {
            Map<Node, Node> NodeMap = new HashMap<Node,Node>();

            Node org_Node = head;
            while (head != null){
                if(!NodeMap.containsKey(head)){
                    int val = head.val;
                    Node new_obj = new Node(val,new Node(),new Node());
                    NodeMap.put(head, new_obj);
                }
                head = head.next;
            }
            head = org_Node;
            while (head != null){

                if(head.next != null){
                    Node node_obj_next = NodeMap.get(head.next);
                    Node node_obj_random =  NodeMap.get(head.random);
                    Node node_obj = NodeMap.get(head);

                    node_obj.next = node_obj_next;
                    node_obj.random = node_obj_random;
                }
                if(head.next == null){
                    Node node_obj = NodeMap.get(head);
                    Node node_obj_random =  NodeMap.get(head.random);

                    node_obj.next = null;
                    node_obj.random = node_obj_random;
                }
                head = head.next;
            }

            return NodeMap.get(org_Node);
        }
    }
}
