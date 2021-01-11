package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.BITree;
import com.vkeonline.lintcode.common.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 206. Interval Sum
 *
 * @author csgear
 */
public class IntervalSum {
    /**
     * @param A:       An integer list
     * @param queries: An query list
     * @return The result list
     */
    public List<Long> intervalSum(int[] A, List<Interval> queries) {
        int n = A.length;

        BITree biTree = new BITree(A.length);

        for (int i = 0; i < n; i++) {
            biTree.increase(i, A[i]);
        }

        List<Long> result = new ArrayList<>();

        for (Interval interval : queries) {
            result.add((long) biTree.query(interval.end) - biTree.query(interval.start - 1));
        }

        return result;
    }


}
