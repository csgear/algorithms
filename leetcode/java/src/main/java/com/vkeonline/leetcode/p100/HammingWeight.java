package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 191. Number of 1 Bits
 * @author csgear
 */
public class HammingWeight {
    /**
     * count # of 1 in an integer n, clean the lst using n & (n-1)
     * @param n, an integer
     * @return the @ of 1 in n
     */
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;

    }
}
