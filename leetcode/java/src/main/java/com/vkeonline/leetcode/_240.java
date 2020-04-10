package com.vkeonline.leetcode;

public class _240 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        Solution solution = new _240().new Solution();

        System.out.println(solution.searchMatrix(matrix, 5));
    }

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if (matrix.length == 0) return false;
            int n = matrix[0].length;
            return searchMatrix(matrix, target, 0, n - 1);
        }

        private boolean searchMatrix(int[][] matrix, int target, int top, int right) {
            int m = matrix.length;

            if (top >= m || right < 0) return false;

            if (target == matrix[top][right]) return true;

            if (target > matrix[top][right])
                return searchMatrix(matrix, target, top + 1, right);
            else
                return searchMatrix(matrix, target, top, right - 1);
        }
    }
}
