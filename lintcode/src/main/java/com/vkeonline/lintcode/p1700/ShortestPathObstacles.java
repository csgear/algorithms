package com.vkeonline.lintcode.p1700;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 1723. Shortest Path in a Grid with Obstacles Elimination
 * * @author csgear
 */
public class ShortestPathObstacles {
    public int shortestPath(int[][] grid, int k) {
        if (grid == null || grid.length == 0) {
            return -1;
        }

        int m = grid.length;
        int n = grid[0].length;

        int[] dirs = {0, 1, 0, -1, 0};
        int[][] visited = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(visited[i], Integer.MAX_VALUE);
        }

        Queue<int[]> queue = new LinkedList<>();
        int steps = 0;
        visited[0][0] = 0;

        queue.add(new int[]{0, 0, 0});

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] data = queue.poll();
                if (data[0] == m - 1 && data[1] == n - 1) {
                    return steps;
                }

                for (int j = 0; j < 4; j++) {
                    int x = data[0] + dirs[j];
                    int y = data[1] + dirs[j + 1];
                    if (x >= 0 && x < m && y >= 0 && y < n) {
                        int obstacles = data[2] + grid[x][y];
                        if (obstacles > k || obstacles >= visited[x][y]) {
                            continue;
                        }

                        visited[x][y] = obstacles;
                        queue.add(new int[]{x, y, obstacles});
                    }

                }
            }
            steps++;
        }

        return -1;
    }
}
