package com.vkeonline.leetcode.p200;

import java.util.Arrays;

public class _204 {
    class Solution {
        public int countPrimes(int n) {
            boolean[] isPrime = new boolean[n] ;

            Arrays.fill(isPrime, true);

            int upper = (int) Math.sqrt(n) ;

            for(int i = 2 ; i <= upper ; i++) {
                if(isPrime[i]) {
                    for(int j = i * i ; j < n ; j += i)
                        isPrime[j] = false ;
                }
            }

            int result = 0 ;

            for(boolean b: isPrime)
                if(b) result++ ;

            return result ;
        }
    }
}
