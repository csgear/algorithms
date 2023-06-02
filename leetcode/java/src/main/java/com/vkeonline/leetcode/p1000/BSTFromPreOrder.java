package com.vkeonline.leetcode.p1000;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 1008. Construct Binary Search Tree from Preorder Traversal
 * @author csgear
 */
public class BSTFromPreOrder {
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder == null || preorder.length == 0){
            return null;
        }

        return buildTree(preorder, 0, preorder.length-1);
    }

    TreeNode buildTree(int[] preorder, int start, int end){
        if(start > end){
            return null;
        }

        int i = start;
        do{
            i++;
        } while(i <= end && preorder[i]<preorder[start]);

        TreeNode root = new TreeNode(preorder[start]);
        root.left = buildTree(preorder, start+1, i-1);
        root.right = buildTree(preorder, i , end);

        return root;
    }
}
