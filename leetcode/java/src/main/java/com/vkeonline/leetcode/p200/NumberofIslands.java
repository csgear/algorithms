package com.vkeonline.leetcode.p200;

import java.util.ArrayDeque;
import java.util.Queue;


/**
 * Leetcode [M]: 200. Number of Islands
 *
 * @author csgear
 */
public class NumberofIslands {

    public int numIslands(char[][] grid) {
        if (grid == null || grid[0] == null || grid[0].length == 0) {
            return 0;
        }

        int row = grid.length;
        int col = grid[0].length;
        boolean[][] isVisited = new boolean[row][col];
        int result = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1' && !isVisited[i][j]) {
                    isVisited[i][j] = true;
                    bfs(grid, isVisited, row, col, i, j);
                    result += 1;
                }
            }
        }
        return result;
    }

    private void bfs(char[][] grid, boolean[][] visited, int row, int col, int i, int j) {
        int[][] offsets = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(i * col + j);

        while (!queue.isEmpty()) {
            int coords = queue.poll();
            int x = coords / col;
            int y = coords % col;

            for (int[] offset : offsets) {
                int x1 = x + offset[0];
                int y1 = y + offset[1];
                if (x1 >= 0 && x1 < row && y1 >= 0 && y1 < col && grid[x1][y1] == '1' && !visited[x1][y1]) {
                    visited[x1][y1] = true;
                    queue.offer(x1 * col + y1);
                }
            }
        }
    }
}
