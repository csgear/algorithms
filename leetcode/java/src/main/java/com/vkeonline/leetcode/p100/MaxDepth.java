package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [E]: 104. Maximum Depth of Binary Tree
 * @author csgear
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
