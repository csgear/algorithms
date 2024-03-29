package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 98. Validate Binary Search Tree
 * @author csgear
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        else {
            boolean valid = root.val > min && root.val < max;

            if (valid)
                return isValidBST(root.left, min, root.val) &&
                        isValidBST(root.right, root.val, max);
            else
                return false;
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
