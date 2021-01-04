package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.SegmentTreeNode;

/**
 * Lint code: 247. Segment Tree Query II
 *
 * @author csgear
 */
public class SegmentTreeQuery2 {
    public int query(SegmentTreeNode root, int start, int end) {
        if (root == null || start > end) {
            return 0;
        }

        end = Math.min(root.end, end);
        start = Math.max(root.start, start);

        if (start == end && start == root.start && start == root.end) {
            return root.count;
        }

        int mid = (root.start + root.end ) / 2;
        if (end <= mid) {
            return query(root.left, start, end);
        } else if (start >= mid + 1) {
            return query(root.right, start, end);
        } else {
            return query(root.left, start, mid) + query(root.right, mid + 1, end);
        }
    }
}
