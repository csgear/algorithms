package com.vkeonline.lintcode;

/**
 * Lintcode: 28. Search a 2D Matrix
 * @author csgear
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false ;
        }

        if(matrix[0] == null || matrix[0].length == 0) {
            return false ;
        }

        int m = matrix.length ;
        int n = matrix[0].length ;
        int start = 0 ;
        int end = m * n - 1 ;

        while(start <= end) {
            int mid = start + (end - start) / 2 ;
            int num = matrix[mid / n][mid % n] ;
            if(num == target) {
                return true ;
            }
            else if(num > target){
                end = mid - 1 ;
            }
            else {
                start = mid + 1 ;
            }
        }

        return false ;
    }
}
