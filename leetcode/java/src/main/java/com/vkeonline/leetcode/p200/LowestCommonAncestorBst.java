package com.vkeonline.leetcode.p200;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 235. Lowest Common Ancestor of a Binary Search Tree
 * @author csgear
 */
public class LowestCommonAncestorBst {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}
