package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.Node;

import javax.swing.tree.TreeNode;

/**
 * Leetcode [M]: 116. Populating Next Right Pointers in Each Node
 * @author csgear
 */
public class PopulateNextRight {
    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

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
        if (root == null || root.left == null) {
            return root;
        }

        root.left.next = root.right;
        if (root.next != null) {
            root.right.next = root.next.left;
        }

        connect (root.left);
        connect (root.right);

        return root;

    }
}
