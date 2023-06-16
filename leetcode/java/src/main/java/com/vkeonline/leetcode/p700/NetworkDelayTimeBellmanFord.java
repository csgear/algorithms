/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p700;

import java.util.Arrays;

/**
 * @author xiaojun.yang
 */
public class NetworkDelayTimeBellmanFord {
    public int networkDelayTime(int[][] times, int n, int k) {
        return bellmanFord(times, n, k);
    }

    private int bellmanFord(int[][] times, int n, int k) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k - 1] = 0;
        for (int i = 1; i < n; ++i) {
            for (int[] time : times) {
                int u = time[0] - 1;
                int v = time[1] - 1;
                int w = time[2];
                dist[v] = Math.min(dist[v], dist[u] + w);
            }
        }
        int max = Arrays.stream(dist).max().getAsInt();
        return max == Integer.MAX_VALUE ? -1 : max;
    }

}
