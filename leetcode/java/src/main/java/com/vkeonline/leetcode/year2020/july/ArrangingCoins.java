package com.vkeonline.leetcode.year2020.july;

/**
 * @author csgear
 */
public class ArrangingCoins {
    public int arrangeCoins(int n) {
        long N = (long)n*8 + 1;
        return ((int)Math.sqrt(N) - 1) / 2;
    }
}
