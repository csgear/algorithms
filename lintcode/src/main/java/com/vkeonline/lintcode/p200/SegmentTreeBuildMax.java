package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.SegmentTreeNode;

/**
 * Lint code: 439. Segment Tree Build II
 * @author csgear
 */
public class SegmentTreeBuildMax {
    public SegmentTreeNode build(int[] A) {
        return buildTree(0, A.length -1 , A) ;
    }

    private SegmentTreeNode buildTree(int start, int end, int[] A) {
        if(start > end) {
            return null ;
        }

        if(start == end) {
            return new SegmentTreeNode(start, end, A[start]) ;
        }

        SegmentTreeNode node = new SegmentTreeNode(start, end, A[start]) ;

        int middle = (start + end) / 2 ;

        node.left = buildTree(start, middle, A) ;
        node.right = buildTree(middle + 1, end, A) ;

        if(node.left != null && node.left.max > node.max) {
            node.max = node.left.max ;
        }

        if(node.right != null && node.right.max > node.max) {
            node.max = node.right.max ;
        }

        return node ;
    }
}
