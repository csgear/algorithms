package com.vkeonline.leetcode.p600;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 669. Trim a Binary Search Tree
 * @author csgear
 */
public class TrimBinarySearchTree {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if(root == null)  {
            return null;
        }
        if(root.val > high) {
            return trimBST(root.left, low, high) ;
        }
        if(root.val < low) {
            return trimBST(root.right, low, high) ;
        }

        root.left = trimBST(root.left, low, high) ;
        root.right = trimBST(root.right, low, high) ;
        return root ;

    }
}
