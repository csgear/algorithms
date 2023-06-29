package com.vkeonline.leetcode.p1400;

/**
 * Leetcode [H]: 1473. Paint House III
 * @author csgear
 */
public class PaintHouse3 {
    public static final int INF = Integer.MAX_VALUE / 2 ;

    // 定义f[i][j][k] 为考虑前i间房子，且第i间房子的颜色编号为j
    // 前i间房子形成的分区数量为k的所有方案中的「最小上色成本」
    public int minCost(int[] houses, int[][] cost, 
            int m, int n, int target) {
        int[][][] dp = new int[m+1][n+1][target+1] ;
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j][0] = INF ;
            }
        }

        for (int i = 1; i <= m ; i++) {
            int color = houses[i-1] ;
            for (int j = 1; j <= n ; j++) {
                for (int k = 1; k <= target; k++) {
                    if(k > i) {
                        dp[i][j][k] = INF ;
                        continue;
                    }
                    if(color != 0) {
                        if(j == color) {
                            int tmp = INF;
                            for (int l = 1; l <= n ; l++) {
                                if(l != j) {
                                    tmp = Math.min(tmp, dp[i - 1][l][k - 1]);
                                }
                            }
                            dp[i][j][k] = Math.min(dp[i - 1][j][k], tmp);
                        }
                        else {
                            dp[i][j][k] = INF ;
                        }
                    } else {
                        int u = cost[i - 1][j - 1];
                        int tmp = INF;
                        for (int p = 1; p <= n; p++) {
                            if (p != j) {
                                tmp = Math.min(tmp, dp[i - 1][p][k - 1]);
                            }
                        }
                        dp[i][j][k] = Math.min(tmp, dp[i - 1][j][k]) + u;
                    }
                }

            }
        }
        int ans = INF;
        for (int i = 1; i <= n; i++) {
            ans = Math.min(ans, dp[m][i][target]);
        }
        return ans == INF ? -1 : ans;
    }
}
