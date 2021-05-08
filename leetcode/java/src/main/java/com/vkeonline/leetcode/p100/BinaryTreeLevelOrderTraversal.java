package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * travel binary tree in level order, bfs
 * BinaryTreeLevelOrderTraversal
 *
 * @author csgear
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            int k = queue.size();
            ArrayList<Integer> currentLevel = new ArrayList<>();

            TreeNode node;

            for (int i = 0; i < k; i++) {
                node = queue.poll();
                assert node != null;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
                currentLevel.add(node.val);
            }
            result.add(currentLevel);
        }
        return result;
    }
}
