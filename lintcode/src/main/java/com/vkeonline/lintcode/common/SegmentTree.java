package com.vkeonline.lintcode.common;

/**
 * @author csgear
 */
public class SegmentTree {
    private static final int NOT_FOUND = -1;

    public SegmentTreeNode buildMinTree(int start, int end, int[] nums) {
        if (start > end) {
            return null;
        }

        SegmentTreeNode root = new SegmentTreeNode(start, end, Integer.MIN_VALUE);

        if (start == end) {
            root.min = nums[start];
        } else {
            int middle = (start + end) / 2;
            root.left = buildMinTree(start, middle, nums);
            root.right = buildMinTree(middle + 1, end, nums);
            root.min = Math.min(root.left.min, root.right.min);
        }

        return root;
    }

    public SegmentTreeNode buildMaxTree(int start, int end, int[] A) {
        if (start > end) {
            return null;
        }

        SegmentTreeNode root = new SegmentTreeNode(start, end, Integer.MAX_VALUE);

        if (start == end) {
            root.max = A[start];
        } else {
            int middle = (start + end) / 2;
            root.left = buildMinTree(start, middle, A);
            root.right = buildMinTree(middle + 1, end, A);
            root.max = Math.max(root.left.max, root.right.max);
        }

        return root;
    }

    public int queryMin(SegmentTreeNode root, int start, int end) {

        if (root == null || start > end) {
            return NOT_FOUND;
        }

        end = Math.min(root.end, end);
        start = Math.max(root.start, start);

        if (start == root.start && end == root.end) {
            return root.min;
        }

        int mid = (root.start + root.end) / 2;
        if (end <= mid) {
            return queryMin(root.left, start, end);
        } else if (start >= mid + 1) {
            return queryMin(root.right, start, end);
        } else {
            return Math.min(queryMin(root.left, start, mid),
                    queryMin(root.right, mid + 1, end));
        }
    }

    public int queryMax(SegmentTreeNode root, int start, int end) {

        if (root == null || start > end) {
            return NOT_FOUND;
        }

        end = Math.min(root.end, end);
        start = Math.max(root.start, start);

        if (start == root.start && end == root.end) {
            return root.max;
        }

        int mid = (root.start + root.end) / 2;
        if (end <= mid) {
            return queryMax(root.left, start, end);
        } else if (start >= mid + 1) {
            return queryMax(root.right, start, end);
        } else {
            return Math.max(queryMax(root.left, start, mid),
                    queryMax(root.right, mid + 1, end));
        }
    }
}
