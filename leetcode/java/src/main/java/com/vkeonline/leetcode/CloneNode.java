package com.vkeonline.leetcode;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * @author csgear
 */
public class CloneNode {
    TreeNode ans, target;

    public void inorder(TreeNode o, TreeNode c) {
        if (o != null) {
            inorder(o.left, c.left);
            if (o == target) {
                ans = c;
            }
            inorder(o.right, c.right);
        }
    }

    private TreeNode getTargetCopy(
            final TreeNode original,
            final TreeNode cloned,
            final TreeNode target) {
        this.target = target;
        inorder(original, cloned);
        return ans;
    }
}
