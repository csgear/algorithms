package com.vkeonline.leetcode.p700;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 701. Insert into a Binary Search Tree
 * @author csgear
 */
public class InsertBst {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
