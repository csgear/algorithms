package com.vkeonline.leetcode.year2020.dec;

/**
 * @author csgear
 */
public class BurstBalloons {
    public int maxCoins(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[][] dp = new int[nums.length][nums.length];
        for (int len = 1; len <= nums.length; len++) {
            for (int start = 0; start <= nums.length - len; start++) {
                int end = start + len - 1;
                for (int i = start; i <= end; i++) {
                    int coins = nums[i] * getValue(nums, start - 1) * getValue(nums, end + 1);

                    if (i != start) {
                        coins += dp[start][i - 1];
                    }

                    if (i != end) {
                        coins += dp[i + 1][end];
                    }

                    dp[start][end] = Math.max(dp[start][end], coins);
                }
            }
        }
        return dp[0][nums.length - 1];
    }

    /**
     * Deal with num[-1] and num[num.length]
     */
    private int getValue(int[] nums, int i) {
        if (i < 0 || i >= nums.length) {
            return 1;
        }
        return nums[i];
    }
}
