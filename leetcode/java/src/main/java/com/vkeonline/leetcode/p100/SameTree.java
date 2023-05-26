package com.vkeonline.leetcode.p100;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [E]: 100. Same Tree
 * @author csgear
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null || p.val != q.val) {
            return false;
        } else {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }
}
