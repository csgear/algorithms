package com.vkeonline.lintcode.p400;

import com.vkeonline.lintcode.common.TreeNode;

/**
 * 448. Inorder Successor in BST
 *
 * @author csgear
 */
public class InorderSuccessor {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if (root == null || p == null) {
            return null;
        }
        if (root.val <= p.val) {
            return inorderSuccessor(root.right, p);
        } else {
            TreeNode left = inorderSuccessor(root.left, p);
            return (left != null) ? left : root;
        }
    }
}
