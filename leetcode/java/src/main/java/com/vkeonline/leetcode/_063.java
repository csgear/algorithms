package com.vkeonline.leetcode;

public class _063 {
    public class Solution1 {
        public int uniquePathsWithObstacles(int[][] grid) {
            int m = grid.length, n = grid[0].length ;

            int[][] dp = new int[m][n] ;

            dp[0][0] = grid[0][0] == 1 ? 0 : 1 ;
            for(int i = 1 ; i < m ; i++) {
                if(grid[i][0] == 1) dp[i][0] = 0 ;
                else
                    dp[i][0] = dp[i-1][0] ;
            }

            for(int j = 1 ; j < n ; j++) {
                if(grid[0][j] == 1) dp[0][j] = 0 ;
                else
                    dp[0][j] = dp[0][j-1] ;
            }

            for(int i = 1 ; i < m ; i++) {
                for(int j = 1 ; j < n ; j++) {
                    if(grid[i][j] == 1) dp[i][j] = 0 ;
                    else dp[i][j] = dp[i-1][j] + dp[i][j-1] ;
                }
            }

            return dp[m-1][n-1] ;
        }
    }
    public class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            if (obstacleGrid == null || obstacleGrid.length == 0 || obstacleGrid[0].length == 0) {
                return 0;
            }

            int n = obstacleGrid.length;
            int m = obstacleGrid[0].length;
            int[][] paths = new int[n][m];

            for (int i = 0; i < n; i++) {
                if (obstacleGrid[i][0] != 1) {
                    paths[i][0] = 1;
                } else {
                    break;
                }
            }
            for (int i = 0; i < m; i++) {
                if (obstacleGrid[0][i] != 1) {
                    paths[0][i] = 1;
                } else {
                    break;
                }
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    if (obstacleGrid[i][j] != 1) {
                        paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                    } else {
                        paths[i][j] = 0;
                    }
                }
            }

            return paths[n - 1][m - 1];
        }
    }
}
