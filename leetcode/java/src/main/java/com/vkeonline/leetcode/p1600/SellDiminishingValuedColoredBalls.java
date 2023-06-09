

package com.vkeonline.leetcode.p1600;

import java.util.PriorityQueue;

/**
 * Leetcode [M]: 1648. Sell Diminishing-Valued Colored Balls
 * @author csgear
 */
public class SellDiminishingValuedColoredBalls {
    private final int MOD = (int) 1e9 + 7;
    public int maxProfit(int[] inventory, int orders) {
        int max = 0;
        for (int x : inventory) {
            max = Math.max(max, x);
        }
        int l = -1, r = max + 1;
        while (l + 1 < r) {
            int c = l + (r - l) / 2;
            if (check(inventory, orders, c)) {
                l = c;
            } else {
                r = c;
            }
        }
        long ans = 0;
        for (int x : inventory) {
            if (x > r) {
                ans += (long) (x + r + 1) * (x - r) / 2;
                ans %= MOD;
                orders -= x - r;
            }
        }
        ans += (long) r * orders;
        return (int) (ans % MOD);
    }

    private boolean check(int[] nums, int orders, int x) {
        int sum = 0;
        for (int num : nums) {
            sum += Math.max(num - x, 0);
            if (sum > orders) {
                return true;
            }
        }
        return false;
    }
}
