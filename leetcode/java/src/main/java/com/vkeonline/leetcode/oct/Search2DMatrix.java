package com.vkeonline.leetcode.oct;

/**
 * @author csgeear
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;

        int low = 0;
        int high = row-1;
        int mid = (low + high)  / 2;
        while (low <= high) {
            mid = (low + high) /2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                high = mid-1;
            } else if (matrix[mid][0] < target) {
                low = mid+1;
            }

        }

        int found = mid;
        low = 0;
        high = column-1;
        while (low <= high) {
            mid =  (low + high) / 2;
            if (matrix[found][mid] == target) {
                return true;
            } else if (matrix[found][mid] > target) {
                high = mid-1;
            } else if (matrix[found][mid] < target) {
                low = mid+1;
            }
        }
        return false;
    }
}
