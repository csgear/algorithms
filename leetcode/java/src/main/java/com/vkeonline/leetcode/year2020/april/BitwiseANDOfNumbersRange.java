package com.vkeonline.leetcode.year2020.april;

/**
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
