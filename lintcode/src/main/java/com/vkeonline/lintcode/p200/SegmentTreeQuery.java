package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.SegmentTreeNode;

/**
 * Lint code: 202. Segment Tree Query
 * @author csgear
 */
public class SegmentTreeQuery {
    /**
     * @param root: The root of segment tree.
     * @param start: start value.
     * @param end: end value.
     * @return The maximum number in the interval [start, end]
     */
    public int query(SegmentTreeNode root, int start, int end) {
        if (start == root.start && end == root.end) {
            return root.max;
        }

        int mid = (root.start + root.end) / 2;

        if (end <= mid) {
            return query(root.left, start, end);
        }

        if (start >= mid + 1) {
            return query(root.right, start, end);
        }

        return Math.max(query(root.left, start, mid), query(root.right, mid + 1, end));
    }
}
