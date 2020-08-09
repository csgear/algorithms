package com.vkeonline.leetcode.may;

import com.vkeonline.leetcode.common.TreeNode;

public class CousinsBinaryTree {
    class Pair {
        TreeNode parent ;
        int level ;
        Pair(TreeNode parent, int level) {
            this.parent = parent ;
            this.level = level ;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        Pair first = helper(root, x, null, 0) ;
        Pair second = helper(root, y, null, 0) ;

        return first.parent != second.parent && first.level == second.level ;
    }

    private Pair helper(TreeNode node, int x, TreeNode parent, int level) {
        if(node == null) return null ;

        if(node.val == x) {
            return new Pair(parent, level) ;
        }

        Pair left = helper(node.left, x, node, level + 1) ;
        Pair right = helper(node.right, x, node, level + 1) ;

        return left != null? left : right ;
    }
}
