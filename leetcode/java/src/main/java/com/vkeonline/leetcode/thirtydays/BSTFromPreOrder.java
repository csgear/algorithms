package com.vkeonline.leetcode.thirtydays;

import com.vkeonline.leetcode.common.TreeNode;

public class BSTFromPreOrder {


    public TreeNode bstFromPreorder(int[] preorder) {
        int n = preorder.length;
        if (n == 0) return null;
        TreeNode res = new TreeNode(preorder[0]);

        for (int i = 1; i < n; i++) {
            res = insert(res, preorder[i]);
        }
        return res;
    }

    private TreeNode insert(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val <= root.val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }
}
