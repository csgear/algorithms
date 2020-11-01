package com.vkeonline.leetcode.year2020.june;

import java.util.Arrays;

/**
 * @author csgear
 */
public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        int[][] dp = new int[dungeon.length + 1][dungeon[0].length + 1];
        for (int i = 0; i < dungeon.length + 1; i++) {
            Arrays.fill(dp[i], -1);
        }

        return mhr(dungeon, 0, 0, dp);
    }

    private int mhr(int[][] dungeon, int i, int j, int[][] dp) {
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        if (i == dungeon.length - 1 && j == dungeon[0].length - 1) {
            return dungeon[i][j] > 0 ? 1 : Math.abs(dungeon[i][j]) + 1;
        }
        if (i == dungeon.length || j == dungeon[0].length) {
            return Integer.MAX_VALUE;
        }

        return dp[i][j] = Math.max(1, Math.min(mhr(dungeon, i + 1, j, dp), mhr(dungeon, i, j + 1, dp)) - dungeon[i][j]);
    }
}
