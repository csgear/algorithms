package com.vkeonline.codility;

public class PickApples {
    public int solution(int[] A, int K, int L) {
        int n = A.length;
        if (n < K + L) {
            return -1;
        }
        int result = helper(A, K, L);
        reverse(A);
        result = Math.max(result, helper(A, K, L));
        return result;
    }

    private int helper(int[] A, int K, int L) {
        int n = A.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = A[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = A[i] + prefixSum[i - 1];
        }

        int[] prefixK = new int[n];
        int[] postfixL = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == K - 1) {
                prefixK[i] = rangeSum(prefixSum, i - K + 1, i);
            } else if (i > K - 1) {
                prefixK[i] = Math.max(rangeSum(prefixSum, i - K + 1, i), prefixK[i - 1]);
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (i + L - 1 == n - 1) {
                postfixL[i] = rangeSum(prefixSum, i, i + L - 1);
            } else if (i + L - 1 < n - 1) {
                postfixL[i] = Math.max(rangeSum(prefixSum, i, i + L - 1), postfixL[i + 1]);
            }
        }

        int result = 0;
        for (int i = 0; i < n - 1; i++) {
            result = Math.max(result, prefixK[i] + postfixL[i + 1]);
        }
        return result;
    }

    private void reverse(int[] data) {
        int left = 0, right = data.length - 1;
        for (; left < right; left++, right--) {
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;
        }
    }

    private int rangeSum(int[] prefixSum, int l, int r) {
        if (l == 0) {
            return prefixSum[r];
        }
        return prefixSum[r] - prefixSum[l - 1];
    }

}
