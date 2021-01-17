package com.vkeonline.lintcode.p1300;

/**
 * @author csgear
 * Lint code: 1314. Power of Two
 */
public class PowerOfTwo {

    /**
     * x & (x - 1)  => Turn off the lowbit, if the number has only one bit, then x & (x - 1)==0
     */
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    /**
     * get the lowbit and it shall be the only bit
     */
    public boolean isPowerOfTwo1(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (-n)) == n;
    }
}
