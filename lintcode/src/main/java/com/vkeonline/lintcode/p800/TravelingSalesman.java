package com.vkeonline.lintcode.p800;

import java.util.Arrays;

/**
 * LintCode 816. Traveling Salesman
 * @author csgear
 */
public class TravelingSalesman {

    int n;
    int res = Integer.MAX_VALUE;
    boolean[] visited;
    int[][] graph;

    private void dfs(int level, int prev, int cost) {
        if (cost >= res) return;
        if (level == n) {
            res = Math.min(res, cost);
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i] && graph[prev][i] != Integer.MAX_VALUE) {
                visited[i] = true;
                dfs(level + 1, i, cost + graph[prev][i]);
                visited[i] = false;
            }
        }
    }

    /**
     * @param nn:    an integer,denote the number of cities
     * @param roads: a list of three-tuples,denote the road between cities
     * @return: return the minimum cost to travel all cities
     */
    public int minCost(int nn, int[][] roads) {
        n = nn;
        graph = new int[n][n];
        visited = new boolean[n];
        Arrays.fill(visited, false);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int[] road : roads) {
            int x = road[0] - 1;
            int y = road[1] - 1;
            graph[x][y] = Math.min(graph[x][y], road[2]);
            graph[y][x] = Math.min(graph[y][x], road[2]);
        }

        visited[0] = true;
        dfs(1, 0, 0);

        return res;
    }
}


