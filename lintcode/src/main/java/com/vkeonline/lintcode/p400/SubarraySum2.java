package com.vkeonline.lintcode.p400;

/**
 * Lint code: 404. Subarray Sum II
 *
 * @author csgear
 */
public class SubarraySum2 {

    public int subarraySumII(int[] A, int start, int end) {

        int startR = 0;
        int endR = 0;
        int[] sum = new int[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            sum[i + 1] = A[i] + sum[i];
        }

        int result = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > end) {
                continue;
            }
            while (startR < A.length && sum[startR + 1] - sum[i + 1] + A[i] < start) {
                startR++;
            }

            while (endR < A.length && sum[endR + 1] - sum[i + 1] + A[i] <= end) {
                endR++;
            }

            result += endR - startR;


        }

        return result;
    }
}
