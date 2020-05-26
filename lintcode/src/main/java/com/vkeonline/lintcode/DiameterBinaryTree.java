package com.vkeonline.lintcode;

import com.vkeonline.lintcode.common.TreeNode;

/**
 * LintCode: 1181. Diameter of Binary Tree
 */
public class DiameterBinaryTree {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans - 1;
    }

    private int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);
        int R = depth(node.right);
        ans = Math.max(ans, L + R + 1);
        return Math.max(L, R) + 1;
    }
}
