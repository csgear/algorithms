package com.vkeonline.leetcode.year2020.april;

import com.vkeonline.leetcode.common.TreeNode;

public class BTMaximumPathSum {
    private int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // write your code here
        dfs(root);
        return max;
    }

    private int dfs(TreeNode root){
        if (root == null) {
            return -1;
        }

        int leftResult = dfs(root.left);
        int rightResult = dfs(root.right);
        int sum = root.val;

        if (leftResult > 0) {
            sum += leftResult;
        }
        if (rightResult > 0) {
            sum += rightResult;
        }

        max = Math.max(max, sum);

        // this line is the most important
        return Math.max(0, root.val + Math.max(0, Math.max(leftResult, rightResult)));
    }
}
