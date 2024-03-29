package com.vkeonline.leetcode.p400;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode [M]: 449. Serialize and Deserialize BST
 * @author csgear
 */
public class SerializeBst {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        return root.val + "," + serialize(root.left) + "," + serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        String[] S = data.split(",");
        Queue<String> queue = new LinkedList<>();
        Collections.addAll(queue, S);

        return deserializeUtil(queue);
    }

    private TreeNode deserializeUtil(Queue<String> queue) {
        while (!queue.isEmpty()) {
            String s = queue.poll();
            if ("".equals(s)) {
                return null;
            }

            TreeNode node = new TreeNode(Integer.parseInt(s));

            node.left = deserializeUtil(queue);
            node.right = deserializeUtil(queue);

            return node;
        }

        return null;
    }
}
