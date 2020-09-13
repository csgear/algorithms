package com.vkeonline.lintcode;

/**
 * Lintcode: 1333. Reverse Bits
 *
 * @author csgear
 */
public class ReverseBits {
    final static int LENGTH = 32;

    public long reverseBits(long n) {
        long reversed = 0;
        for (int i = 0; i < LENGTH; i++) {
            reversed = (reversed << 1) | (n & 1);
            n = (n >> 1);
        }

        return reversed;
    }
}
