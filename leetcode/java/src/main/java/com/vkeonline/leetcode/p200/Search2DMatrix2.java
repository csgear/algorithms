package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 240. Search a 2D Matrix II
 * @author csgear
 */
public class Search2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int n = matrix[0].length;
        return searchMatrix(matrix, target, 0, n - 1);
    }

    private boolean searchMatrix(int[][] matrix, int target, int top, int right) {
        int m = matrix.length;

        if (top >= m || right < 0)
            return false;

        if (target == matrix[top][right])
            return true;

        if (target > matrix[top][right])
            return searchMatrix(matrix, target, top + 1, right);
        else
            return searchMatrix(matrix, target, top, right - 1);
    }
}

