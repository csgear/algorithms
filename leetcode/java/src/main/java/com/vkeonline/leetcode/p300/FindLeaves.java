package com.vkeonline.leetcode.p300;

import com.vkeonline.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 366. Find Leaves of Binary Tree
 *
 * @author csgear
 */
public class FindLeaves {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        getHeight(root, result);
        return result;
    }

    private Integer getHeight(TreeNode root, List<List<Integer>> result) {
        if (root == null)
            return -1;
        int height = Math.max(getHeight(root.left, result), getHeight(root.right, result)) + 1;
        if (result.size() <= height)
            result.add(new ArrayList<>());
        result.get(height).add(root.val);
        return height;
    }
}
