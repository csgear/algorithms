package com.vkeonline.leetcode.p800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _886 {
    class Solution {
        public boolean possibleBipartition(int N, int[][] dislikes) {
            List<List<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < N; i++) graph.add(new ArrayList<>());

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

            for (Integer ajacent : graph.get(i)) {
                if (color[ajacent] != 0) {
                    if (color[ajacent] == color[i]) return false;
                    else continue;
                } else {
                    result &= dfs(ajacent, graph, color, nextColor * -1);
                }
            }

            return result;
        }
    }
}
