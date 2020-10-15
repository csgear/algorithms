package com.vkeonline.lintcode.p1200;

import com.vkeonline.lintcode.common.TreeNode;

/**
 * lint code: 1254. Sum of Left Leaves
 * @author csgear
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0 ;
        }

        int sum = 0 ;

        if(root.left != null) {
            TreeNode left = root.left ;
            if(left.left == null && left.right == null) {
                sum += left.val;
            }
            else {
                sum += sumOfLeftLeaves(left) ;
            }
        }

        if(root.right != null) {
            sum += sumOfLeftLeaves(root.right) ;
        }

        return sum ;

    }
}
