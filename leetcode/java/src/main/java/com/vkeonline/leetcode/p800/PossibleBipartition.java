package com.vkeonline.leetcode.p800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode [M]: 886. Possible Bipartition
 *
 * @author csgear
 */
public class PossibleBipartition {
    public boolean possibleBipartition(int N, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] dislike : dislikes) {
            graph.get(dislike[0] - 1).add(dislike[1] - 1);
            graph.get(dislike[1] - 1).add(dislike[0] - 1);
        }

        int[] color = new int[N];
        Arrays.fill(color, 0);

        boolean result = true;

        for (int i = 0; i < N && result; i++) {
            if (color[i] == 0) {
                result = dfs(i, graph, color, 1);
            }
        }
        return result;
    }

    boolean dfs(int i, List<List<Integer>> graph, int[] color, int nextColor) {
        color[i] = nextColor;
        boolean result = true;
        for (Integer adjacent : graph.get(i)) {
            if (color[adjacent] != 0) {
                if (color[adjacent] == color[i]) {
                    return false;
                }
            } else {
                result &= dfs(adjacent, graph, color, nextColor * -1);
            }
        }
        return result;
    }
}
