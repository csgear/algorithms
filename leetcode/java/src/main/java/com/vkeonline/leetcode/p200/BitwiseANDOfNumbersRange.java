package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 201. Bitwise AND of Numbers Range
 * @author csgear
 */
public class BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        while(n>m) {
            n = n & n - 1;
        }
        return m&n;
    }
}
