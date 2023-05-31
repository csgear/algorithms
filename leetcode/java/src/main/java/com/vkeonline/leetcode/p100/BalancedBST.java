package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 110. Balanced Binary Tree
 * @author csgear
 */
public class BalancedBST {

    private int depth (TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max (depth(root.left), depth (root.right)) + 1;
    }

    public boolean isBalanced (TreeNode root) {
        if (root == null) {
            return true;
        }

        int left=depth(root.left);
        int right=depth(root.right);

        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
}
