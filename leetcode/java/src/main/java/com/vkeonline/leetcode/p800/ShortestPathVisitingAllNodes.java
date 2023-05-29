package com.vkeonline.leetcode.p800;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Leetcode [H]: 847. Shortest Path Visiting All Nodes
 * @author csgear
 */
public class ShortestPathVisitingAllNodes {

    public int shortestPathLength(int[][] graph) {
        if (graph.length == 1)
            return 0;
        int n = graph.length;
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[n][1 << n];
        for (int i = 0; i < n; i++) {
            q.offer(new int[]{ i, 1 << i });
        }

        int step = 0;
        int target = (1 << n) - 1;

        while (!q.isEmpty()) {
            int size = q.size();
            step++;
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int next : graph[cur[0]]) {
                    int nextState = cur[1] | 1 << next;
                    if (nextState == target)
                        return step;
                    if (visited[next][nextState])
                        continue;
                    q.offer(new int[]{ next, nextState });
                    visited[next][nextState] = true;
                }
            }
        }

        return -1;
    }
}
