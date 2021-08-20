////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package com.vkeonline.leetcode.p1300;

import com.vkeonline.leetcode.common.TreeNode;


/**
 * Leetcode [M]: 1339. Maximum Product of Splitted Binary Tree
 * @author csgear
 */
public class MaxProductSplittedBinaryTree {
    private int totalSum = 0 ;
    private long maxProduct = 0 ;
    private static final int MODULE = 1000000007 ;

    private int computeTreeSum(TreeNode node) {
        if(node == null) {
            return 0 ;
        }
        return computeTreeSum(node.left) + computeTreeSum(node.right) + node.val ;
    }

    private int computeMaxProduct(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSum = computeMaxProduct(node.left) ;
        int rightSum = computeMaxProduct(node.right) ;
        int currentSum = leftSum + rightSum + node.val ;
        maxProduct = Math.max(maxProduct, (long) currentSum * (totalSum - currentSum )) ;
        return currentSum ;
    }

    public int maxProduct(TreeNode root) {
        totalSum = computeTreeSum(root) ;
        computeMaxProduct(root) ;
        return (int) (maxProduct % MODULE) ;
    }
}
