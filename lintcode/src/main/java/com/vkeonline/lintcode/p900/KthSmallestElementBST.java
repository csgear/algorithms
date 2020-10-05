package com.vkeonline.lintcode.p900;

import com.vkeonline.lintcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Lintcode: 902. Kth Smallest Element in a BST
 *
 * @author csgear
 */
public class KthSmallestElementBST {
    public int kthSmallest(TreeNode root, int k) {
        Map<TreeNode, Integer> numChildren = new HashMap<>();
        countNodes(root, numChildren);
        return quickSelectOnTree(root, k, numChildren) ;
    }

    private int countNodes(TreeNode root, Map<TreeNode, Integer> numChildren) {
        if (root == null) {
            return 0;
        }

        int left = countNodes(root.left, numChildren);
        int right = countNodes(root.right, numChildren);
        numChildren.put(root, left + right + 1);
        return left + right + 1;
    }

    private int quickSelectOnTree(TreeNode root, int k, Map<TreeNode, Integer> numOfChildren) {
        if (root == null) {
            return -1;
        }

        int left = root.left == null ? 0 : numOfChildren.get(root.left);
        if (left >= k) {
            return quickSelectOnTree(root.left, k, numOfChildren);
        }

        if (left + 1 == k) {
            return root.val;
        }

        return quickSelectOnTree(root.right, k - left - 1, numOfChildren);

    }
}
