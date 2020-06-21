package com.vkeonline.leetcode.june;

/**
 * @author csgear
 */
public class XorOperation {
    public int xorOperation(int n, int start) {
        int xor = 0;
        for(int i = 0; i < n; i++) {
            xor ^= start + 2 * i;
        }
        return xor;
    }
}
