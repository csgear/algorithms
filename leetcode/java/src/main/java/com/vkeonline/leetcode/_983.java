package com.vkeonline.leetcode;

public class _983 {
    class Solution {
        public int mincostTickets(int[] days, int[] costs) {
            int n = days.length;
            int max = days[n - 1];
            int[] dp = new int[max + 1];
            int[] req = new int[max + 1];
            for (int day : days) req[day] = 1;
            dp[0] = 0;

            for (int i = 1; i <= max; i++) {
                if (req[i] == 0) {
                    dp[i] = dp[i - 1];
                } else {
                    dp[i] = dp[i - 1] + costs[0];
                    dp[i] = Math.min(dp[i], dp[Math.max(0, i - 7)] + costs[1]);
                    dp[i] = Math.min(dp[i], dp[Math.max(0, i - 30)] + costs[2]);
                }
            }

            return dp[max];
        }
    }
}
