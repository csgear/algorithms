package com.vkeonline.leetcode.p500;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [E]: 543. Diameter of Binary Tree
 * @author csgear
 */
public class DiameterOfBinaryTree {

    private int ans = 0 ;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        dfs(root);
        return ans - 1;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = dfs(node.left);
        int right = dfs(node.right);
        ans = Math.max(ans, left+right+1);
        return Math.max(left, right) + 1;
    }

}
