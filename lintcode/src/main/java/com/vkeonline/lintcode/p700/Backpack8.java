package com.vkeonline.lintcode.p700;

/**
 * Lint code: 799. Backpack VIII
 *
 * @author csgear
 */
public class Backpack8 {
    /**
     * @param n:      the value from 1 - n
     * @param value:  the value of coins
     * @param amount: the number of coins
     * @return how many different value
     */
    public int backPackVIII(int n, int[] value, int[] amount) {
        int m = value.length;
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
        int res = 0;
        for (int i = 0; i < m; i++) {
            int[] cnt = new int[n + 1];
            for (int j = value[i]; j <= n; j++) {
                if (dp[j - value[i]] && !dp[j] && cnt[j - value[i]] < amount[i]) {
                    cnt[j] += cnt[j - value[i]] + 1;
                    res++;
                    dp[j] = true;
                }
            }
        }
        return res;
    }
}
