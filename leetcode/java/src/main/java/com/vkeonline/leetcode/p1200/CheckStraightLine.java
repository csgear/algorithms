package com.vkeonline.leetcode.p1200;

/**
 * LeetCode [M] : 1232. Check If It Is a Straight Line
 *
 * @author csgear
 */
public class CheckStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) {
            return true;
        }

        int x1 = coordinates[0][0], x2 = coordinates[1][0];
        int y1 = coordinates[0][1], y2 = coordinates[1][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0];
            int y3 = coordinates[i][1];

            if ((y2 - y1) * (x3 - x2) != (y3 - y2) * (x2 - x1)) {
                return false;
            }
        }

        return true;
    }
}
