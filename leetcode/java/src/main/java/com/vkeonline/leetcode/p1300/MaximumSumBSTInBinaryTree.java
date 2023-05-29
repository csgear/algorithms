
package com.vkeonline.leetcode.p1300;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [H]: 1373
 * @author csger
 */
public class MaximumSumBSTInBinaryTree {
    public static final int INF = 0x3f3f3f3f ;
    int result ;
    class SubTree {
        boolean isBST ;
        int maxValue ;
        int minValue ;
        int sumValue ;
        SubTree(boolean isBST, int minValue, int maxValue, int sumValue) {
            this.isBST = isBST;
            this.minValue = minValue;
            this.maxValue = maxValue;
            this.sumValue = sumValue;
        }

    }
    public int maxSumBST(TreeNode root) {
        result = 0;
        dfs(root);
        return result;
    }

    private SubTree dfs(TreeNode root) {
        if(root == null) {
            return new SubTree(true, INF, -INF, 0) ;
        }
        SubTree left = dfs(root.left) ;
        SubTree right = dfs(root.right) ;

        if (left.isBST && right.isBST && root.val > left.maxValue
            && root.val < right.minValue) {
            int sum = root.val + left.sumValue + right.sumValue ;
            result = Math.max(result, sum) ;

            return new SubTree(
                    true,Math.min(left.minValue, root.val),
                    Math.max(root.val, right.maxValue), sum) ;
        }
        else {
            return new SubTree(false, 0, 0, 0) ;
        }
    }
}
