package com.vkeonline.lintcode;

/**
 * LintCode 64. Merge Sorted Array
 */
public class MergeSortedArray {
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int i = m - 1, j = n - 1, last = m + n - 1 ;

        while (i >= 0 && j >= 0) {
            if (A[i] > B[j]) {
                A[last--] = A[i--];
            } else {
                A[last--] = B[j--];
            }
        }
        while (i >= 0) {
            A[last--] = A[i--];
        }
        while (j >= 0) {
            A[last--] = B[j--];
        }

    }
}
