package com.vkeonline.lintcode;

import com.vkeonline.lintcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * LintCode: 67. Binary Tree Inorder Traversal
 */
public class BSTInorder {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();

        helper(root, result);
        return result;
    }

    void helper(TreeNode node, List<Integer> list) {
        if (node == null) return;
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }
}
