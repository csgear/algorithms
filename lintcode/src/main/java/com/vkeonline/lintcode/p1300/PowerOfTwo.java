package com.vkeonline.lintcode.p1300;

/**
 * @author csgear
 * Lint code: 1314. Power of Two
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
