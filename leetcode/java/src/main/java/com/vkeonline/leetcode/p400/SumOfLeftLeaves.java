package com.vkeonline.leetcode.p400;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [E] : 404. Sum of Left Leaves
 *
 * @author csgear
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int ans = 0;

        if (root != null) {
            TreeNode left = root.left;
            TreeNode right = root.right;

            if (left != null && left.left == null && left.right == null) {
                ans += left.val;
            }

            ans += sumOfLeftLeaves(left) + sumOfLeftLeaves(right);
        }
        return ans;
    }
}
