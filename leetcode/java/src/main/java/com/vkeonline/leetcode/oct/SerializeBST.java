package com.vkeonline.leetcode.oct;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author csgear
 */
public class SerializeBST {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        return String.valueOf(root.val) + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        String[] S = data.split(",");
        Queue<String> queue = new LinkedList<>();
        for (String s : S) {
            queue.add(s);
        }

        return deserializeUtil(queue);
    }

    private TreeNode deserializeUtil(Queue<String> queue) {
        while (!queue.isEmpty()) {
            String s = queue.poll();
            if ("".equals(s)) {
                return null;
            }

            TreeNode node = new TreeNode(Integer.valueOf(s));

            node.left = deserializeUtil(queue);
            node.right = deserializeUtil(queue);

            return node;
        }

        return null;
    }
}
