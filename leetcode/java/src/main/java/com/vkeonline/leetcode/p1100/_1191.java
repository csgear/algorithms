package com.vkeonline.leetcode.p1100;

import java.util.Arrays;

public class _1191 {
    public static void main(String[] args) {
        int n = - 1 ;
        int MODULE = 1000000007;

        System.out.println(n % MODULE) ;

    }
    public class Solution {
        public int KConcatenationMaxSum(int[] arr, int k) {
            int MODULE = 1000000007;
            long arraySum = Arrays.stream(arr).sum() ;
            long maxSum = 0 ;
            long currentSum = 0 ;
            for(int j = 0 ; j < Math.min(k, 2); j++) {
                for (int value : arr) {
                    currentSum = (currentSum + value) ;
                    if (currentSum > 0) {
                        maxSum = Math.max(currentSum, maxSum);
                    } else {
                        currentSum = 0;
                    }
                }
            }

            if(arraySum > 0) {
                maxSum = ( maxSum + Math.max(k-2, 0) * arraySum) % MODULE ;
            }

            return (int) maxSum ;
        }
    }
}
