package com.vkeonline.leetcode.p000;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 98. Validate Binary Search Tree
 * @author csgear
 */
public class ValidateBST {
    public boolean isValidBST(TreeNode root) {

        return validate(root, null, null);
    }

    private boolean validate(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }

        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }

        return validate(root.left, low, root.val) && validate(root.right, root.val, high);
    }
}
