package com.vkeonline.lintcode.p1300;

/**
 * LintCode: 1347. Factorial Trailing Zeroes
 * @author csgear
 */
public class FactorialTrailingZeroes {
    public int trailingZeroes (int n) {

        if (n >= 5) {
            return n / 5 + trailingZeroes (n / 5);
        } else {
            return 0;
        }
    }
}
