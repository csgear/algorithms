package com.vkeonline.leetcode.p1300;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.ArrayDeque;

/**
 * Leetcode [M]: 1302. Deepest Leaves Sum
 *
 * @author csgear
 */
public class DeepestLeavesSum {
    private int maxDepth = 0;
    private int sumAtMaxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {
//      return bfs(root) ;
        dfs(root, 0);
        return sumAtMaxDepth;
    }

    private int bfs(TreeNode treeNode) {
        ArrayDeque<TreeNode> nextLevel = new ArrayDeque<>();
        ArrayDeque<TreeNode> currentLevel = new ArrayDeque<>();

        nextLevel.offer(treeNode);

        while (!nextLevel.isEmpty()) {
            currentLevel = nextLevel.clone();
            nextLevel.clear();
            for (TreeNode node : currentLevel) {
                if (node.left != null) {
                    nextLevel.offer(node.left);
                }
                if (node.right != null) {
                    nextLevel.offer(node.right);
                }
            }
        }

        int result = 0;
        for (TreeNode node : currentLevel) {
            result += node.val;
        }
        return result;
    }

    private void dfs(TreeNode node, int currentLevel) {
        if (node == null) {
            return;
        }

        if (currentLevel > maxDepth) {
            maxDepth = currentLevel;
            sumAtMaxDepth = node.val;
        } else if (currentLevel == maxDepth) {
            sumAtMaxDepth += node.val;
        }

        dfs(node.left, currentLevel + 1);
        dfs(node.right, currentLevel + 1);
    }
}
