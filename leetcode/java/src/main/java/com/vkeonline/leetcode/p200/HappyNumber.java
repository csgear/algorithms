package com.vkeonline.leetcode.p200;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode [E]: 202. Happy Number
 * @author csgear
 */
public class HappyNumber {
    static int numSquareSum(int n) {
        int squareSum = 0;
        while (n != 0) {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
        return squareSum;
    }

    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>();

        while (true) {
            n = numSquareSum(n) ;
            if (n == 1) {
                return true;
            }

            if (st.contains(n)) {
                return false;
            }

            st.add(n);
        }

    }
}
