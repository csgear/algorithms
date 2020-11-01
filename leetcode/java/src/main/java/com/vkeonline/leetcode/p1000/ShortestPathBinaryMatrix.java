package com.vkeonline.leetcode.p1000;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author csgear
 */
public class ShortestPathBinaryMatrix {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if (grid.length == 0 || grid[0][0] == 1) {
            return -1;
        }
        int n = grid.length;
        int[][] dirs = {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};
        Queue<int[]> q = new ArrayDeque<>();
        grid[0][0] = 1;
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int row = curr[0];
                int col = curr[1];
                if (row == n - 1 && col == n - 1) {
                    return grid[row][col];
                }
                for (int[] dir : dirs) {
                    int[] next = {row + dir[0], col + dir[1]};
                    if (next[0] >= 0 && next[0] < n &&
                            next[1] >= 0 && next[1] < n && grid[next[0]][next[1]] == 0) {
                        grid[next[0]][next[1]] = grid[row][col] + 1;
                        q.offer(next);
                    }
                }
            }
        }
        return -1;
    }
}

