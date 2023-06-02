package com.vkeonline.leetcode.p100;

import com.sun.source.tree.Tree;
import com.vkeonline.leetcode.common.TreeNode;

import java.util.Stack;


/**
 * Leetcode [M]: 173. Binary Search Tree Iterator
 * @author csgear
 */
class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        stack = new Stack<>() ;
        leftmostInorder(root);
    }

    private void leftmostInorder(TreeNode node) {
        while (node != null) {
            stack.push(node) ;
            node = node.left ;
        }
    }
    public int next() {
        TreeNode node = stack.pop() ;
        if(node.right != null) {
            leftmostInorder(node.right);
        }
        return node.val ;
    }

    public boolean hasNext() {
        return stack.size() > 0 ;
    }
}