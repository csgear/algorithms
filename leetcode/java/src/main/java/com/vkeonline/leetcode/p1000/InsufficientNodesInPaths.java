/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p1000;

import com.vkeonline.leetcode.common.TreeNode;

/**
 * Leetcode [M]: 1080. Insufficient Nodes in Root to Leaf Paths
 * @author csgear
 */
public class InsufficientNodesInPaths   {
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean haveSufficient = checkSufficientLeaf(root, 0, limit);
        return haveSufficient ? root : null;
    }

    public boolean checkSufficientLeaf(TreeNode node, int sum, int limit) {
        if(node == null) {
            return false ;
        }

        if (node.left == null && node.right == null) {
            return node.val + sum >= limit;
        }

        boolean haveSufficientLeft = checkSufficientLeaf(node.left,
                sum + node.val, limit) ;
        boolean haveSufficientRight = checkSufficientLeaf(node.right,
                sum + node.val, limit) ;

        if (!haveSufficientLeft) {
            node.left = null;
        }

        if (!haveSufficientRight) {
            node.right = null;
        }

        return haveSufficientLeft || haveSufficientRight ;

    }
}