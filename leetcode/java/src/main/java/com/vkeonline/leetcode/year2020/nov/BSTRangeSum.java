package com.vkeonline.leetcode.year2020.nov;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class BSTRangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root, low, high) ;
    }

    private int dfs(TreeNode node, int low, int high) {
        int sum = 0;
        if (node == null) {
            return sum;
        }

        // pruning
        if (node.val > low)
        {
            sum = rangeSumBST(node.left, low, high);
        }
        if (node.val < high)
        {
            sum += rangeSumBST(node.right, low, high);
        }
        if (node.val >= low && node.val <= high) {
            sum += node.val;
        }
        return sum;
    }
}
