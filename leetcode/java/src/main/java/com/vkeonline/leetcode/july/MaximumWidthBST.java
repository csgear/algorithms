package com.vkeonline.leetcode.july;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author csgear
 */
public class MaximumWidthBST {
    class Pair {
        public TreeNode node;
        public int x;

        Pair(TreeNode node, int x) {
            this.node = node;
            this.x = x;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxWidth = 0;
        Queue<Pair> queue = new LinkedList<>();

        queue.add(new Pair(root, 1));
        while (!queue.isEmpty()) {
            Pair first = queue.peek();
            int size = queue.size();
            Pair curr = null;
            while (size-- > 0) {
                curr = queue.poll();
                TreeNode node = curr.node;
                int index = curr.x;
                if (node.left != null) {
                    queue.offer(new Pair(node.left, 2 * index));
                }
                if (node.right != null) {
                    queue.offer(new Pair(node.right, 2 * index + 1));
                }
            }
            maxWidth = Math.max(maxWidth, curr.x - first.x + 1);
        }

        return maxWidth;
    }
}
