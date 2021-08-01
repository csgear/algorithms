package com.vkeonline.leetcode.p1100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Leetcode: 1168. Optimize Water Distribution in a Village
 *
 * @author csgear
 */
public class OptimizeWaterDistribution {
    public int minCostToSupplyWater(int n, int[] wells, int[][] pipes) {
        List<int[]> edges = new ArrayList<>();
        int i, N = wells.length;

        for (i = 0; i < N; i++) {
            edges.add(new int[]{0, i + 1, wells[i]});
        }

        Collections.addAll(edges, pipes);

        edges.sort(Comparator.comparingInt(x -> x[2]));

        int[] parent = new int[N + 1];
        for (i = 0; i <= N; i++) {
            parent[i] = i;
        }

        int minCost = 0, edgeCount = 0;

        for (int[] edge : edges) {
            if (union(edge[0], edge[1], parent)) {
                ++edgeCount;
                minCost += edge[2];
                if (edgeCount == N) {
                    break;
                }
            }
        }
        return minCost;
    }

    private int find(int v, int[] parent) {
        int x = v;
        while (x != parent[x]) {
            x = parent[x];
        }
        parent[v] = x;
        return x;
    }

    private boolean union(int u, int v, int[] parent) {
        if (u != v) {
            int a = find(u, parent);
            int b = find(v, parent);
            if (a != b) {
                parent[a] = b;
                return true;
            }
        }
        return false;
    }
}
