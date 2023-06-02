package com.vkeonline.leetcode.p900;

import java.util.Arrays;

/**
 * Leetcode [M]: 918. Maximum Sum Circular Subarray
 * @author csgear
 */
public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] A) {

        int sum = Arrays.stream(A).sum();
        int currentMax = A[0], maxSum = currentMax;
        int currentMin = A[0], minSum = currentMin;
        for (int i = 1; i < A.length; i++) {
            // either include A[i], or start over from A[i]
            currentMax = Math.max(currentMax + A[i], A[i]);
            maxSum = Math.max(maxSum, currentMax);
            // instead of compute the min, we could inverse each element and apply
            // the kadane algorithm one more time
            currentMin = Math.min(currentMin + A[i], A[i]);
            minSum = Math.min(currentMin, minSum);
        }
        if (sum != minSum) {
            return Math.max(maxSum, sum - minSum);
        }
        return maxSum;
    }

}
