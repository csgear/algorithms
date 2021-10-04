
package com.vkeonline.leetcode.p500;

import com.vkeonline.leetcode.common.TreeNode;


/**
 * Leetcode [E]: 572. Subtree of Another Tree
 * @author csgear
 */
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
        {
            return subRoot == null;
        }

        if(root.val == subRoot.val){
            {
                if(checkIfSame(root, subRoot))
                {
                    return true;
                }
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private boolean checkIfSame(TreeNode root, TreeNode subRoot){
        if(root == null || subRoot == null)
        {
            return subRoot == root;
        }
        if(root.val == subRoot.val){
            return checkIfSame(root.left, subRoot.left) && checkIfSame(root.right, subRoot.right);
        }
        return false;
    }
}
