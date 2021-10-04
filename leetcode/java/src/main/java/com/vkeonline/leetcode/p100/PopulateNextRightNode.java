package com.vkeonline.leetcode.p100;

import java.util.LinkedList;
import java.util.Queue;


/**
 * Leetcode [M]: 117. Populating Next Right Pointers in Each Node II
 *
 * @author csgear
 */
public class PopulateNextRightNode {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }

        // update left next
        if (root.left != null) {
            if (root.right != null) {
                // if right child exists - simple connect left.next to right
                root.left.next = root.right;
            } else {
                // if not - scan parent next node until we find the first left or right child
                root.left.next = findNext(root);
            }
        }
        // update right next
        if (root.right != null) {
            root.right.next = findNext(root);
        }

        // update the right nodes first
        connect(root.right);
        connect(root.left);
        return root;
    }

    private Node findNext(Node root) {
        // scan all next parent nodes until we find the first left or right child
        while (root.next != null) {
            root = root.next;
            if (root.left != null) {
                return root.left;
            }
            if (root.right != null) {
                return root.right;
            }
        }
        return null;
    }

    public Node connectBFS(Node root) {
        {
            if (root == null) {
                return root;
            }
            Queue<Node> q = new LinkedList<>();
            var dup = root;
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                var temp = q.poll();
                if (temp != null) {
                    if (temp.left != null) {
                        q.add(temp.left);
                    }
                    if (temp.right != null) {
                        q.add(temp.right);
                    }
                    if (temp != root) {
                        if (dup == null) {
                            dup = temp;
                        } else {
                            dup.next = temp;
                            dup = temp;
                        }
                    }

                } else {
                    if (!q.isEmpty()) {
                        q.add(null);
                        dup = null;
                    }
                }
            }
            return root;
        }
    }

    class Node {

        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }
}
