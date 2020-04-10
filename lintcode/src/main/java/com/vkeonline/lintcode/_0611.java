package com.vkeonline.lintcode;

import java.util.LinkedList;
import java.util.Queue;

public class _0611 {
    public class Solution {

        public int shortestPath(boolean[][] grid, Point source, Point destination) {
            int[] dx = {1, 1, 2, 2, -1, -1, -2, -2};
            int[] dy = {2, -2, 1, -1, 2, -2, 1, -1};

            if (grid == null || grid.length == 0 || grid[0].length == 0) {
                return -1;
            }

            Queue<Point> queue = new LinkedList<>();
            boolean[][] v = new boolean[grid.length][grid[0].length];

            queue.offer(source);
            v[source.x][source.y] = true;
            int steps = 0;

            while (!queue.isEmpty()) {
                steps++;
                int size = queue.size();
                for (int i = 0; i < size; i++) {
                    Point cur = queue.poll();
                    for (int k = 0; k < 8; k++) {
                        int nx = cur.x + dx[k];
                        int ny = cur.y + dy[k];
                        if (0 <= nx && nx < grid.length && 0 <= ny && ny < grid[0].length && !grid[nx][ny] &&
                                !v[nx][ny]) {
                            if (nx == destination.x && ny == destination.y) {
                                return steps;
                            }
                            queue.offer(new Point(nx, ny));
                            v[nx][ny] = true;
                        }
                    }
                }
            }
            return -1;
        }
    }
}
