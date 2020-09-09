package com.vkeonline.leetcode.Sept;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class SumBinaryTree {
    int sum = 0;

    private void dfs(TreeNode root, int curr) {
        if (root == null) {
            return;
        }

        curr = curr * 2 + root.val;

        if (root.left == null && root.right == null) {
            sum += curr;
        }

        dfs(root.left, curr);
        dfs(root.right, curr);
    }

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        dfs(root, 0);
        return sum;
    }
}
