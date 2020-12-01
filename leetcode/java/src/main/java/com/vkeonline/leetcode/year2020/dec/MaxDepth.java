package com.vkeonline.leetcode.year2020.dec;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 * Leetcode: Maximum Depth of Binary Tree
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        return helper(root) ;
    }

    private int helper(TreeNode node) {
        if(node ==null) {
            return 0 ;
        }

        return Math.max(helper(node.left), helper(node.right)) + 1 ;
    }
}
