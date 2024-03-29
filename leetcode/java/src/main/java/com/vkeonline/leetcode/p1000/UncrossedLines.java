package com.vkeonline.leetcode.p1000;

/**
 * Leetcode [M]: 1035. Uncrossed Lines
 * @author csgear
 */
public class UncrossedLines {
    /**
     * LCS problem
     * @param A input
     * @param B input
     * @return longest subsequence
     */
    public int maxUncrossedLines(int[] A, int[] B) {
        int m = A.length ;
        int n = B.length ;
        int[][] dp = new int[m+1][n+1] ;

        for(int i = 0 ; i < m ; i++) {
            for(int j = 0 ; j < n ; j++) {
                if(A[i] == B[j]) {
                    dp[i+1][j+1] = 1 + dp[i][j] ;
                } else {
                    dp[i+1][j+1] = Math.max(dp[i][j+1], dp[i+1][j]) ;
                }
            }
        }

        return dp[m][n] ;
    }
}
