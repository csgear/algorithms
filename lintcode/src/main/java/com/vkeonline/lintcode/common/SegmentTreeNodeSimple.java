package com.vkeonline.lintcode.common;

/**
 * @author csgear
 */
public class SegmentTreeNodeSimple {
    public int start, end, max;
    public SegmentTreeNodeSimple left, right;

    public SegmentTreeNodeSimple(int start, int end) {
        this.start = start;
        this.end = end;
        this.left = this.right = null;
    }
}