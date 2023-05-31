package com.vkeonline.leetcode.p700;

/**
 * Leetcode [M]: 785. Is Graph Bipartite?
 * @author csgear
 */
public class BipartiteGraph {

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        boolean result = true;

        for (int i = 0; i < n && result; i++) {
            if (color[i] == 0) {
                result &= dfs(i, graph, color, 1);
            }
        }
        return result;

    }

    boolean dfs(int i, int[][] graph, int[] color, int nextColor) {
        color[i] = nextColor;
        boolean result = true;

        for (int j = 0; j < graph[i].length && result; j++) {
            int neighbor = graph[i][j];

            if (color[neighbor] != 0) {
                if (color[neighbor] == color[i])
                    return false;
                else
                    continue;
            } else {
                result &= dfs(neighbor, graph, color, nextColor * -1);
            }
        }
        return result;
    }
}
