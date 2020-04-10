package com.vkeonline.lintcode;

public class _1797 {
    public class Solution {
        /**
         * @param A: a integer sorted array
         * @param B: a integer sorted array
         * @param K: a integer
         * @return: return a pair of index
         */
        public int[] optimalUtilization(int[] A, int[] B, int K) {
            if (A == null || A.length == 0 || B == null || B.length == 0) {
                return new int[0];
            }

            int i = 0, j = B.length - 1;

            int sum = Integer.MIN_VALUE;
            int[] res = new int[2];

            while (i < A.length && j >= 0) {
                if (A[i] + B[j] > K) j--;
                else {
                    while (j > 0 && B[j] == B[j - 1]) j--;
                    if (A[i] + B[j] > sum) {
                        sum = A[i] + B[j];
                        res = new int[]{i, j};
                    }
                    i++;
                }
            }

            return res;
        }
    }
}
