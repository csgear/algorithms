

package com.vkeonline.uwaterloo;

/**
 * @author csgear
 */
public class MathSol {
    public int winningStrategy(int n) {
        //  dp[n] = true if A has a winning strategy when
        //  there are n toothpicks remaining, and false otherwise.
        boolean[] dp = new boolean[n + 1];

        if (n <= 6) {
            return n - 2;
        }

        dp[3] = dp[4] = dp[5] = dp[6] = true;

        // if A loses at n - 3 / n - 4 / n - 6,
        // A is going to win with extra 3,4,6 toothpicks
        for (int i = 7; i <= 50; i++) {
            dp[i] = !dp[i - 3] || !dp[i - 4] || !dp[i - 6];
        }

        int ans = 0;

        for (int i = 0; i <= 50; i++) {
            ans += dp[i] ? 1 : 0;
        }

        return ans;
    }

    public int numberOfWords(int n) {
        int[] v = new int[n];
        int[] c = new int[n];
        v[0] = 2;
        c[0] = 0;
        for (int i = 1; i < n; i++) {
            v[i] = c[i - 1] * 2;
            c[i] = v[i - 1] * 4 + c[i - 1] * 3;
        }
        return v[n - 1] + c[n - 1];
    }
}
