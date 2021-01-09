package com.vkeonline.leetcode.year2020.june;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.right) ;
        TreeNode right = invertTree(root.left) ;
        root.left = left ;
        root.right = right ;
        return  root ;
    }
}
