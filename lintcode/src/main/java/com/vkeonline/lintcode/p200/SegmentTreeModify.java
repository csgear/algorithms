package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.SegmentTreeNode;

/**
 * Lint code: 203. Segment Tree Modify
 *
 * @author csgear
 */
public class SegmentTreeModify {
    /**
     * @param root:  The root of segment tree.
     * @param index: index.
     * @param value: value
     * @return nothing
     */
    public void modify(SegmentTreeNode root, int index, int value) {
        if (root.start == index && root.end == index) {
            root.max = value;
            return;
        }

        int middle = (root.start + root.end) / 2;
        if (index <= middle) {
            modify(root.left, index, value);
        } else {
            modify(root.right, index, value);
        }

        root.max = Math.max(root.left.max, root.right.max);
    }
}
