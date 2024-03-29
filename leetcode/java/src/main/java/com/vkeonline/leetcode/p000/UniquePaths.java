package com.vkeonline.leetcode.p000;

import java.util.Arrays;

/**
 * Leetcode [M]: 62. Unique Paths
 * @author csgear
 */
public class UniquePaths {
    class Solution {
        public int uniquePaths(int m, int n) {
            int[] mat = new int[m];
            Arrays.fill(mat, 1);
            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    mat[j] = mat[j - 1] + mat[j];
                }
            }
            return mat[m - 1];
        }
    }
}

