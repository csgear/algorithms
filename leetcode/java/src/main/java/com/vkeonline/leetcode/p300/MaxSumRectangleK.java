package com.vkeonline.leetcode.p300;

import java.util.Arrays;
import java.util.TreeSet;

/**
 * Leetcode [H]: 363. Max Sum of Rectangle No Larger Than K
 *
 * @author csgear
 */
public class MaxSumRectangleK {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int result = Integer.MIN_VALUE;
        int[] rowSum = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(rowSum, 0);
            for (int row = i; row < matrix.length; row++) {
                for (int col = 0; col < matrix[0].length; col++) {
                    rowSum[col] += matrix[row][col];
                }
                result = Math.max(result, maxSumSubArray(rowSum, k));
                if (result == k) {
                    return result;
                }
            }
        }

        return result;
    }

    private int maxSumSubArray(int[] arr, int k) {
        TreeSet<Integer> set = new TreeSet<>();
        int sum = 0;
        set.add(sum);
        int result = Integer.MIN_VALUE;
        for (int num : arr) {
            sum += num;
            Integer x = set.ceiling(sum - k);
            if (x != null) {
                result = Math.max(result, sum - x);
            }
            set.add(sum);
        }

        return result;
    }
}
