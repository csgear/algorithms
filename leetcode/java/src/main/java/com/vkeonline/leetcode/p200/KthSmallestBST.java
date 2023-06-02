package com.vkeonline.leetcode.p200;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 230. Kth Smallest Element in a BST
 * @author csgear
 */
public class KthSmallestBST {
    public int kthSmallest(TreeNode root, int k) {
        Map<TreeNode, Integer> numOfChildren = new HashMap<>();
        countNodes(root, numOfChildren);
        return quickSelectOnTree(root, k, numOfChildren);
    }

    private int countNodes(TreeNode root, Map<TreeNode, Integer> numOfChildren) {
        if (root == null) {
            return 0;
        }

        int left = countNodes(root.left, numOfChildren);
        int right = countNodes(root.right, numOfChildren);
        numOfChildren.put(root, left + right + 1);
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

    // using an array to sort an BST in O(N) time, but we could do better
    public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) {
            return arr;
        }
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }

    public int kthSmallestWithSortedArray(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root, new ArrayList<>());
        return nums.get(k - 1);
    }
}

