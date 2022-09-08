

package com.vkeonline.leetcode.p200;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 298. Binary Tree Longest Consecutive Sequence
 * @author csgear
 */
public class BstLongestConsecutiveSequence {
    private int maxLength = 0;

    public int longestConsecutive(TreeNode root) {
        dfs(root, null, 0);
        return maxLength;
    }

    private void dfs(TreeNode p, TreeNode parent, int length) {
        if (p == null) {
            return;
        }
        length = (parent != null && p.val == parent.val + 1) ? length + 1 : 1;
        maxLength = Math.max(maxLength, length);
        dfs(p.left, p, length);
        dfs(p.right, p, length);
    }
}
