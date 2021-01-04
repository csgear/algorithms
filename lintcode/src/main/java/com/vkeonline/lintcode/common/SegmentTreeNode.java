package com.vkeonline.lintcode.common;

/**
 * @author csgear
 */
public class SegmentTreeNode {
    public int start, end, max, count;
    public SegmentTreeNode left;
    public SegmentTreeNode right;

    public SegmentTreeNode(int start, int end, int max) {
        this.start = start;
        this.end = end;
        this.max = max ;
        this.left = this.right = null;
    }
}