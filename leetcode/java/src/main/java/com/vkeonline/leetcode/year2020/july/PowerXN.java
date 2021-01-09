package com.vkeonline.leetcode.year2020.july;

/**
 * @author csgear
 */
public class PowerXN {
    private double pow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return pow(x * x, n / 2);
        }
        return x * pow(x * x, n / 2);
    }

    public double myPow(double x, int n) {
        if (n < 0) {
            return 1.0 / pow(x, -n);
        }
        return pow(x, n);
    }
}
