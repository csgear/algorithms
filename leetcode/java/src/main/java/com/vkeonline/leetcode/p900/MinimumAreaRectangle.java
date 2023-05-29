package com.vkeonline.leetcode.p900;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode [M]: 939. Minimum Area Rectangle
 * @author csgear
 */
public class MinimumAreaRectangle {
    static class Point {
        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Point p) {
            return x == p.x && y == p.y;
        }

        @Override
        public int hashCode() {
            return x * 4001 + y;
        }
    }

    public int minAreaRect(int[][] points) {
        Set<Integer> pointSet = new HashSet<>();
        for (int[] point : points)
            pointSet.add(40001 * point[0] + point[1]);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; ++i)
            for (int j = i + 1; j < points.length; ++j) {
                if (points[i][0] != points[j][0] && points[i][1] != points[j][1]) {
                    if (pointSet.contains(40001 * points[i][0] + points[j][1]) &&
                            pointSet.contains(40001 * points[j][0] + points[i][1])) {
                        ans = Math.min(ans, Math.abs(points[j][0] - points[i][0]) *
                                Math.abs(points[j][1] - points[i][1]));
                    }
                }
            }

        return ans < Integer.MAX_VALUE ? ans : 0;
    }
}
