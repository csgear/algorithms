

package com.vkeonline.leetcode.p900;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Leetcode [M]: 934. Shortest Bridge
 * @author csgear
 */
public class ShortestBridge {
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    Queue<int[]> queue = new ArrayDeque<>();
                    dfs(grid, i, j, queue);
                    int step = 0;
                    while (!queue.isEmpty()) {
                        for (int k = queue.size(); k > 0; k--) {
                            int[] cell = queue.poll();
                            int x = cell[0], y = cell[1];
                            for (int d = 0; d < 4; d++) {
                                int nx = x + dirs[d][0];
                                int ny = y + dirs[d][1];
                                if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                    if (grid[nx][ny] == 0) {
                                        queue.offer(new int[]{nx, ny});
                                        grid[nx][ny] = -1;
                                    } else if (grid[nx][ny] == 1) {
                                        return step;
                                    }
                                }
                            }
                        }
                        step++ ;
                    }
                }
            }
        }
        return 0 ;
    }

    // add all nodes of first island to the queue
    private void dfs(int[][] grid, int x, int y, Queue<int[]> queue) {
        if(x < 0 || y < 0 || x >= grid.length ||
            y >= grid[0].length || grid[x][y] != 1) {
            return ;
        }
        queue.offer(new int[]{x,y}) ;
        grid[x][y] = -1 ;
        dfs(grid, x + 1, y, queue) ;
        dfs(grid, x - 1, y, queue) ;
        dfs(grid, x, y - 1, queue) ;
        dfs(grid, x, y + 1, queue) ;
    }
}
