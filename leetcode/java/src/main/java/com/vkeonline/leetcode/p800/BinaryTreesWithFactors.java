
package com.vkeonline.leetcode.p800;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 823. Binary Trees With Factors
 *
 * @author csgear
 */
public class BinaryTreesWithFactors {
    public int numFactoredBinaryTrees(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;
        long[] dp = new long[n];
        Arrays.sort(arr);
        Arrays.fill(dp, 1);

        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < n; ++i) {
            index.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    int right = arr[i] / arr[j];
                    if (index.containsKey(right)) {
                        dp[i] = (dp[i] + dp[j] * dp[index.get(right)]) % MOD;
                    }
                }
            }
        }

        long ans = 0;
        for (long x : dp) {
            ans += x;
        }
        return (int) (ans % MOD);
    }
}
