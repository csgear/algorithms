package com.vkeonline.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class _939 {
    public static void main(String[] args) {
        Set<int[]> set1 = new HashSet<>();
        int[] p1 = new int[]{1, 1};
        int[] p2 = new int[]{1, 1};

        set1.add(p1);
        set1.add(p2);
        System.out.println(set1.size());

        Set<Point> set2 = new HashSet<>();
        Point p3 = new Point(1, 1);
        Point p4 = new Point(1, 1);
        set2.add(p3);
        set2.add(p4);
        System.out.println(set2.size());

    }

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

    class Solution {
        public int minAreaRect(int[][] points) {
            Set<Integer> pointSet = new HashSet<>();
            for (int[] point : points)
                pointSet.add(40001 * point[0] + point[1]);

            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < points.length; ++i)
                for (int j = i + 1 ; j < points.length; ++j) {
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
}
