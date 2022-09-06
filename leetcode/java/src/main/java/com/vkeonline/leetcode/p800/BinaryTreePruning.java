

package com.vkeonline.leetcode.p800;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 814. Binary Tree Pruning
 * @author csgear
 */
public class BinaryTreePruning {
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null ;
    }

    private boolean containsOne(TreeNode node) {
        if (node == null) {
            return false ;
        }

        boolean left = containsOne(node.left) ;

        if(!left) {
            node.left = null ;
        }

        boolean right = containsOne(node.right) ;

        if(!right) {
            node.right = null ;
        }

        return node.val == 1 || left || right ;
    }
}
