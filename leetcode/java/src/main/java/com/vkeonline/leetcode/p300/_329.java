package com.vkeonline.leetcode.p300;

import java.util.Arrays;

public class _329 {
    public static void main(String[] args) {
        int[][] matrix = {{1,2}, {4,3}} ;
        Solution solution = new _329().new Solution() ;
        System.out.println(solution.longestIncreasingPath(matrix)) ;
    }
    class Solution {
        private int m, n ;
        private int[][] dp ;
        public int longestIncreasingPath(int[][] matrix) {
            if (matrix.length == 0) return 0 ;
            m = matrix.length ;
            n = matrix[0].length ;

            int ans = 0 ;
            dp = new int[m][n] ;
            for(int i = 0 ; i < m ; i++)
                Arrays.fill(dp[i], -1);

            for(int i = 0 ; i < m ; i++) {
                for(int j = 0 ; j < n ; j++) {
                    ans = Math.max(ans, dfs(matrix, i, j)) ;
                }
            }
            return ans ;
        }

        private int dfs(int[][] matrix, int row, int col) {
            if(dp[row][col] != -1) return dp[row][col] ;
            int[] dirs = {0, -1, 0, 1, 0} ;
            dp[row][col] = 1 ;

            for(int i = 0 ; i < 4 ; i++) {
                int nextRow = row + dirs[i] ;
                int nextCol = col + dirs[i+1] ;
                if(nextRow < 0 || nextRow >= m || nextCol < 0 || nextCol >= n ||
                        matrix[nextRow][nextCol] <= matrix[row][col])
                    continue;
                dp[row][col] = Math.max(dp[row][col], dfs(matrix, nextRow, nextCol) + 1) ;
            }

            return dp[row][col] ;
        }
    }
}
