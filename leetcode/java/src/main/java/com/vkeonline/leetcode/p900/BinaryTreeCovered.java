package com.vkeonline.leetcode.p900;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [H]: 968. Binary Tree Cameras
 * @author csgear
 */
public class BinaryTreeCovered {

    public int minCameraCover(TreeNode root) {
        return solve(root)[0];
    }

//    Return value of minCameraCoverUtil is an array of length 3.
//    arr[0] -> min number of cameras required to cover all the nodes.
//    arr[1] -> min number of cameras required to cover all the nodes provided root is installed with cameras
//    arr[2] -> minimum number of cameras required for covering left and right child tree .
    private int [] solve(TreeNode root) {
        if(root == null)
            return new int []{0,0,0};

        int [] left = solve(root.left);
        int [] right = solve(root.right);

        int min = 1 + left[2]+right[2];
        if(root.left != null)
            min = Math.min(min, left[1]+right[0]);

        if(root.right != null)
            min = Math.min(min, right[1]+left[0]);

        int includeRoot = 1 + Math.min(left[1],left[2]) + Math.min(right[1], right[2]);

        return new int []{min, includeRoot, left[0]+right[0]};
    }
}
