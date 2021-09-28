package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 74. Search a 2D Matrix
 * @author csgeear
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;

        int left = 0, right = m * n - 1;
        int middle, middleElement;
        while (left <= right) {
            middle = left + (right - left) / 2;
            middleElement = matrix[middle / n][middle % n];
            if (target == middleElement) {
                return true;
            } else {
                if (target < middleElement) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return false;
    }
}
