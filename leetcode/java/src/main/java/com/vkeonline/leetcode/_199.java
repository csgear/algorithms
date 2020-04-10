package com.vkeonline.leetcode;

import java.util.*;

public class _199 {
    static class BinaryTreeRightSideView {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Queue<TreeNode> currentLevel = new ArrayDeque<>();

            if (root == null) return result;

            currentLevel.offer(root);

            while (!currentLevel.isEmpty()) {
                int size = currentLevel.size();
                for (int i = 0; i < size; i++) {
                    TreeNode node = currentLevel.poll();
                    assert node != null;
                    if (node.left != null) currentLevel.offer(node.left);
                    if (node.right != null) currentLevel.offer(node.right);
                    if (i == size - 1) result.add(node.val);
                }
            }

            return result;
        }
    }
}
