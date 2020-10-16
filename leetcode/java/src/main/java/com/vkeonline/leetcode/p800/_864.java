package com.vkeonline.leetcode.p800;

import java.util.LinkedList;
import java.util.Queue;

public class _864 {
    public class Solution {
        public int shortestPathAllKeys(String[] grid) {
            Queue<int[]> q = new LinkedList<>();
            int[][] dir = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
            int m = grid.length;
            int n = grid[0].length();
            char[][] chars = new char[m][n];

            int allKey = 0;

            for (int i = 0; i < m; i++) {
                char[] arr = grid[i].toCharArray();
                chars[i] = arr;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == '@') q.offer(new int[]{i, j, 0});
                    if (arr[j] >= 'a' && arr[j] <= 'f') {
                        allKey = allKey | 1 << (arr[j] - 'a');
                    }
                }
            }

            boolean[][][] visited = new boolean[m][n][allKey + 1];

            int step = 0;

            while (!q.isEmpty()) {
                int size = q.size();
                step++ ;
                for (int i = 0; i < size; i++) {
                    int[] cur = q.poll();
                    for (int[] d : dir) {
                        int x = cur[0] + d[0], y = cur[1] + d[1];
                        if (x >= 0 && x < m && y >= 0 && y < n && chars[x][y] != '#') {
                            char c = chars[x][y];
                            // cannot open the lock, continue
                            if (c >= 'A' && c <= 'F' && (cur[2] & 1 << (c - 'A')) == 0) continue;
                            int nextState = cur[2];
                            if (c >= 'a' && c <= 'f') nextState = nextState | 1 << (c - 'a');
                            if (nextState == allKey) return step;
                            if (visited[x][y][nextState]) continue;
                            q.offer(new int[]{x, y, nextState});
                            visited[x][y][nextState] = true;
                        }
                    }
                }
            }

            return -1;
        }
    }
}
