package com.vkeonline.lintcode.p1300;

import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {
        if (n <= 1) {
            return 0;
        }
        int result = 0;
        boolean[] isPrime = new boolean[n];

        Arrays.fill(isPrime, true);

        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                result++;

                for (int j = 2 * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return result;

    }
}
