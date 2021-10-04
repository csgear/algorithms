package com.vkeonline.leetcode.p100;

/**
 * Leetcode [M]: 117. Populating Next Right Pointers in Each Node II
 * @author csgear
 */
public class NextRightNode {
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
}
