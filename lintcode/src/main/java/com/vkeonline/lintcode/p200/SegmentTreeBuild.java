package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.SegmentTreeNodeSimple;

/**
 * Lint code: 201 Segment Tree Build
 *
 * @author csgear
 */
public class SegmentTreeBuild {
    /**
     * @param start, end: Denote an segment / interval
     * @return The root of Segment Tree
     */
    public SegmentTreeNodeSimple build(int start, int end) {
        if (start > end) {
            return null;
        }

        SegmentTreeNodeSimple node = new SegmentTreeNodeSimple(start, end);

        if (start != end) {
            int middle = (start + end) / 2;
            node.left = build(start, middle);
            node.right = build(middle + 1, end);
        }

        return node;
    }
}
