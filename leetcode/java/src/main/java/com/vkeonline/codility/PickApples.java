package com.vkeonline.codility;

public class PickApples {
    public int solution(int[] A, int K, int L) {
        int n = A.length;
        if (n < K + L) {
            return -1;
        }
        int result = helper(A, K, L);
        result = Math.max(result, helper(A, L, K));
        return result;
    }

    /**
     * divide the array into 2 parts, compute the suboptimal solutions
     * of picking K apples from left part and picking L apples from right parts
     */
    private int helper(int[] A, int K, int L) {
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }

        int[] prefixK = new int[n];
        int[] postfixL = new int[n];

        prefixK[K - 1] = rangeSum(prefixSum, 0, K - 1);
        for (int i = K; i < n; i++) {
            prefixK[i] = Math.max(rangeSum(prefixSum, i - K + 1, i), prefixK[i - 1]);
        }

        postfixL[n - L] = rangeSum(prefixSum, n - L, n - 1);
        for (int i = n - L - 1; i >= 0; i--) {
            postfixL[i] = Math.max(rangeSum(prefixSum, i, i + L - 1), postfixL[i + 1]);
        }

        int result = 0;
        for (int i = K; i < n - L; i++) {
            result = Math.max(result, prefixK[i] + postfixL[i + 1]);
        }
        return result;
    }

    /**
     * reverse an array in place
     */
    private void reverse(int[] data) {
        int left = 0, right = data.length - 1;
        for (; left < right; left++, right--) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }

    /**
     * compute range sum
     */
    private int rangeSum(int[] prefixSum, int l, int r) {
        return l == 0 ? prefixSum[r] : prefixSum[r] - prefixSum[l - 1];
    }

}
