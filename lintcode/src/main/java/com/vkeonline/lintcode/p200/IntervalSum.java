package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.Interval;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 206. Interval Sum
 *
 * @author csgear
 */
public class IntervalSum {

    private int[] data, tree;
    private int n;


    /**
     * @param A:       An integer list
     * @param queries: An query list
     * @return The result list
     */
    public List<Long> intervalSum(int[] A, List<Interval> queries) {
        n = A.length;
        data = new int[n];
        tree = new int[n + 1];

        for (int i = 0; i < n; i++) {
            update(i, A[i]);
        }

        List<Long> result = new ArrayList<>();

        for (Interval interval : queries) {
            result.add(query(interval.end) - query(interval.start - 1));
        }

        return result;
    }

    private long query(int index) {
        int sum = 0;
        index++;
        for (int i = index; i > 0; i = i - lowbit(i)) {
            sum += tree[i];
        }
        return sum;
    }

    private void update(int index, int value) {
        long delta = value - data[index];
        data[index] = value;
        index++;
        for (int i = index; i <= n; i = i + lowbit(i)) {
            tree[i] += delta;
        }
    }


    private int lowbit(int x) {
        return (x & (-x));
    }

}
