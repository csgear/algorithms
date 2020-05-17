package com.vkeonline.lintcode;

import java.util.Arrays;

/**
 * LintCode: 1901. Squares of a Sorted Array
 */
public class SquaresSortedArray {
    // n * log(n) method
    public int[] SquareArray_Sort(int[] A) {
        return Arrays.stream(A).map(i -> i * i).sorted().toArray();
    }

    // linear algorithm
    public int[] SquareArray(int[] A) {
        int N = A.length;
        int j = 0;
        while (j < N && A[j] < 0)
            j++;
        int i = j - 1;

        int[] ans = new int[N];
        int t = 0;

        while (i >= 0 && j < N) {
            if (A[i] * A[i] < A[j] * A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j] * A[j];
                j++;
            }
        }

        while (i >= 0) {
            ans[t++] = A[i] * A[i];
            i--;
        }
        while (j < N) {
            ans[t++] = A[j] * A[j];
            j++;
        }

        return ans;
    }
}
