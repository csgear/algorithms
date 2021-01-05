package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.Interval;
import com.vkeonline.lintcode.common.SegmentTree;
import com.vkeonline.lintcode.common.SegmentTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 205. Interval Minimum Number
 * @author csgear
 */
public class IntervalMinimumNumber {
    public List<Integer> intervalMinNumber(int[] A,
                                           List<Interval> queries) {
        SegmentTree tree = new SegmentTree() ;
        SegmentTreeNode root = tree.buildMinTree(0, A.length - 1, A);
        List<Integer> ans = new ArrayList<>();
        for(Interval in : queries) {
            ans.add(tree.queryMin(root, in.start, in.end));
        }
        return ans;
    }
}
