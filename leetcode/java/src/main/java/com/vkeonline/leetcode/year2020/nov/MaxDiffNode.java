package com.vkeonline.leetcode.year2020.nov;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class MaxDiffNode {
    public int maxAncestorDiff(TreeNode root) {
        return helper(root, root.val, root.val);
    }

    private int helper(TreeNode root, int min, int max) {
        if (root == null) {
            return Math.abs(min - max);
        }
        min = Math.min(root.val, min);
        max = Math.max(root.val, max);
        return Math.max(helper(root.left, min, max), helper(root.right, min, max));
    }
}
