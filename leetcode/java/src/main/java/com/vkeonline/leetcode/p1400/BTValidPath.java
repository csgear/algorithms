package com.vkeonline.leetcode.p1400;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 1430. Check If a String Is a Valid Sequence from Root to Leaves Path in a Binary Tree
 * @author csgear
 */
public class BTValidPath {
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return helper(root, arr, 0);
    }

    boolean helper(TreeNode node, int[] arr, int pos) {
        if (node == null) {
            return false;
        }

        if (node.val != arr[pos]) {
            return false;
        }

        if (pos == arr.length - 1) {
            return (node.left == null && node.right == null);
        }

        return helper(node.left, arr, pos + 1) || helper(node.right, arr, pos + 1);
    }
}
