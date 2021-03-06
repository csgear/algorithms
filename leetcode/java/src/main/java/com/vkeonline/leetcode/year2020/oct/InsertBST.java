package com.vkeonline.leetcode.year2020.oct;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class InsertBST {
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
