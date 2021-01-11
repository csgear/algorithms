package com.vkeonline.lintcode.p200;

/**
 * Lint code: 207 Interval Sum II
 *
 * @author csgear
 */
public class IntervalSum2 {
    public class Solution {

        private final int[] data, tree;
        private final int n;

        public Solution(int[] A) {
            n = A.length;
            data = new int[n];
            tree = new int[n + 1];
            for (int i = 0; i < A.length; i++) {
                modify(i, A[i]);
            }
        }

        private int lowbit(int x) {
            return x & (-x);
        }

        public long query(int start, int end) {
            return query(end) - query(start - 1);
        }

        private long query(int index) {
            long sum = 0;
            index++;
            for (int i = index; i > 0; i = i - lowbit(i)) {
                sum += tree[i];
            }
            return sum;
        }

        public void modify(int index, int value) {
            int delta = value - data[index];
            data[index] = value;
            index++;
            for (int i = index; i <= n; i += lowbit(i)) {
                tree[i] += delta;
            }
        }
    }
}
