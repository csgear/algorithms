package com.vkeonline.leetcode.p400;

/**
 * Leetcode [M]: 461. Hamming Distance
 * @author csgear
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {

        return Integer.bitCount(x ^ y);
    }
}
