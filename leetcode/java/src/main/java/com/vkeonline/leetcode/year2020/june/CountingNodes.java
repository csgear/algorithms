package com.vkeonline.leetcode.year2020.june;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class CountingNodes {
    public int countNodes(TreeNode root) {
        return root == null ? 0 : 1 + countNodes(root.left) + countNodes(root.right);
    }
}
