
package com.vkeonline.leetcode.p300;

import com.vkeonline.leetcode.common.TreeNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * Leetcode [M]: 314 Binary Tree Vertical Order Traversal
 *
 * @author csgear
 */
public class BinaryTreeVerticalOrderTraversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeMap<Integer, List<Integer>> tMap = new TreeMap<>();
        Map<TreeNode, Integer> map = new HashMap<>();
        if (root != null) {
            queue.offer(root);
            map.put(root, 0);
        }

        while (!queue.isEmpty()) {
            TreeNode preNode = queue.poll();
            Integer preNodeColIdx = map.get(preNode);
            List<Integer> preList = tMap.getOrDefault(preNodeColIdx, new ArrayList<>());
            preList.add(preNode.val);
            tMap.put(preNodeColIdx, preList);

            if (preNode.left != null) {
                queue.offer(preNode.left);
                map.put(preNode.left, preNodeColIdx - 1);
            }
            if (preNode.right != null) {
                queue.offer(preNode.right);
                map.put(preNode.right, preNodeColIdx + 1);
            }
        }

        return new ArrayList<>(tMap.values());
    }
}
