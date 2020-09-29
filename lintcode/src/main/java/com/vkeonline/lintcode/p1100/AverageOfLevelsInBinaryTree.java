package com.vkeonline.lintcode.p1100;

import com.vkeonline.lintcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Lintcode: 1115. Average of Levels in Binary Tree
 */
public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return null ;
        }

        List<Double> result = new ArrayList<>() ;
        Queue<TreeNode> queue = new LinkedList<>() ;
        queue.offer(root) ;

        while (! queue.isEmpty()) {
            int size = queue.size() ;
            int count = queue.size() ;
            double sum = 0.0 ;
            for(int i = 0 ; i < size ; i++) {
                TreeNode node = queue.poll() ;
                sum += node.val ;
                if(node.left != null) {
                    queue.offer(node.left) ;
                }
                if(node.right != null) {
                    queue.offer(node.right) ;
                }
            }
            result.add(1.0 * sum / size) ;
        }

        return result ;

    }
}
