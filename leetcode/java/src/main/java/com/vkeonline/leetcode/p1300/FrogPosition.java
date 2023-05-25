/*
 * Copyright (c) 2023 HyTrust Inc. All rights reserved.
 */

package com.vkeonline.leetcode.p1300;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode [H]: 1377. Frog Position After T Seconds
 * @author csgear
 */
public class FrogPosition {
    public double frogPosition(int n, int[][] edges, int t, int target) {
        List<List<Integer>> graph = new ArrayList<>() ;
        for (int i = 0; i <= n; ++i) {
            graph.add(i, new ArrayList<>());
        }

        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        boolean[] seen = new boolean[n + 1];
        return dfs(graph, seen, 1, t, target);
    }

    private double dfs(
            List<List<Integer>> graph,
            boolean[] seen,
            int i,
            int t,
            int target) {
        // minus the parent code if a node is not a root node
        int nxt = i == 1 ? graph.get(i).size() : graph.get(i).size() - 1;
        if (t == 0 || nxt == 0) {
            return i == target ? 1.0 : 0.0;
        }
        seen[i] = true;
        double ans = 0.0;
        for (int j : graph.get(i)) {
            if (!seen[j]) {
                ans += dfs(graph, seen, j, t - 1, target);
            }
        }
        return ans / nxt;
    }
}
