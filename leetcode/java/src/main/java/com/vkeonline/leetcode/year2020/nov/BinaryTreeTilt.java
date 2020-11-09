package com.vkeonline.leetcode.year2020.nov;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class BinaryTreeTilt {
    private int totalTilt = 0;

    protected int valueSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = this.valueSum(node.left);
        int rightSum = this.valueSum(node.right);
        int tilt = Math.abs(leftSum - rightSum);
        totalTilt += tilt;

        return node.val + leftSum + rightSum;
    }

    public int findTilt(TreeNode root) {
        totalTilt = 0;
        valueSum(root);
        return totalTilt;
    }
}
