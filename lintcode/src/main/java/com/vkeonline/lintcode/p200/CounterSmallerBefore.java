package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.BITree;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 249. Count of Smaller Number before itself
 *
 * @author csgear
 */
public class CounterSmallerBefore {
    /**
     * @param nums: an integer array
     * @return A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> countOfSmallerNumberII(int[] nums) {
        return countOfSmallerNumber2UsingBitTree(nums);
    }

    public List<Integer> countOfSmallerNumber2UsingBitTree(int[] nums) {
        BITree bitree = new BITree(10000 + 1);
        List<Integer> results = new ArrayList<>();
        for (int num : nums) {
            // query for # which are less than num
            results.add(bitree.query(num - 1));
            bitree.increase(num, 1);
        }

        return results;
    }



    class SegmentTreeNode {
        int start, end;
        int count;
        SegmentTreeNode left, right;

        public SegmentTreeNode(int start, int end, int count) {
            this.start = start;
            this.end = end;
            this.count = count;
        }
    }

    public List<Integer> countOfSmallerNumber2UsingSegmentTree(int[] nums) {
        List<Integer> results = new ArrayList<>();

        SegmentTreeNode root = build(0, 10000);

        for (int num : nums) {
            results.add(querySegmentTree(root, 0, num - 1));
            modifySegmentTree(root, num, 1);
        }

        return results;
    }

    private SegmentTreeNode build(int start, int end) {
        if (start > end) {
            return null;
        }

        SegmentTreeNode node = new SegmentTreeNode(start, end, 0);

        if (start != end) {
            int middle = (start + end) / 2;
            node.left = build(start, middle);
            node.right = build(middle + 1, end);
        } else {
            // For the leaf node, # of nodes which are less than self is 0.
            node.count = 0;
        }

        return node;
    }

    /**
     * Range query for segment tree
     *
     * @param root
     * @param start
     * @param end
     * @return the # of elements in range [start, end]
     */
    private int querySegmentTree(SegmentTreeNode root, int start, int end) {
        if (root == null || start > end) {
            return -1;
        }

        end = Math.min(root.end, end);
        start = Math.max(root.start, start);

        if (start == root.start && end == root.end) {
            return root.count;
        }

        int middle = (root.start + root.end) / 2;

        if (end <= middle) {
            return querySegmentTree(root.left, start, end);
        } else if (start >= middle + 1) {
            return querySegmentTree(root.right, start, end);
        } else {
            return querySegmentTree(root.left, start, middle) +
                    querySegmentTree(root.right, middle + 1, end);
        }
    }

    private void modifySegmentTree(SegmentTreeNode root, int index, int value) {
        if(root.start == index && root.end == index) {
            root.count += value;
            return;
        }

        int middle = (root.start + root.end) / 2;
        if(root.start <= index && index <=middle) {
            modifySegmentTree(root.left, index, value);
        }

        if(middle < index && index <= root.end) {
            modifySegmentTree(root.right, index, value);
        }

        root.count = root.left.count + root.right.count;
    }

}
