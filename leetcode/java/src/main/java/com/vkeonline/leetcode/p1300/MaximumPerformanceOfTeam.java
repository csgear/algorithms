package com.vkeonline.leetcode.p1300;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Leetcode [H]: 1383. Maximum Performance of a Team
 *
 * @author csgear
 */
public class MaximumPerformanceOfTeam {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] engineers = new int[n][2];
        for (int i = 0; i < n; i++) {
            engineers[i] = new int[]{efficiency[i], speed[i]};
        }

        Arrays.sort(engineers, (e1, e2) -> e2[0] - e1[0]);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        long res = 0, speedSum = 0;

        for (int[] engineer : engineers) {
            int e = engineer[0], s = engineer[1];
            minHeap.add(s);
            speedSum += s;
            if (minHeap.size() > k) {
                speedSum -= minHeap.poll();
            }
            res = Math.max(res, (speedSum * e));
        }

        return (int) (res % (long) (1e9 + 7));
    }
}
