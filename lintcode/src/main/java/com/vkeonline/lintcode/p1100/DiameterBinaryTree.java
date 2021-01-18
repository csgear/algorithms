package com.vkeonline.lintcode.p1100;

import com.vkeonline.lintcode.common.TreeNode;

/**
 * LintCode: 1181. Diameter of Binary Tree
 * @author csgear
 */
public class DiameterBinaryTree {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        depth(root);
        return ans ;
    }

    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int left = depth(node.left);
        int right = depth(node.right);
        // the length of path = left + right
        ans = Math.max(ans, left + right);
        return Math.max(left, right) + 1;
    }
}
