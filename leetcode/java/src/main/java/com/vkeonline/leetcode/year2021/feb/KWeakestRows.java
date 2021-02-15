package com.vkeonline.leetcode.year2021.feb;

import java.util.Arrays;

/**
 * @author csgear
 */
public class KWeakestRows {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        int rows = mat.length;
        int cols = mat[0].length;
        int[] scores = new int[rows];
        for (int i = 0; i < rows; i++) {
            int ones = 0;
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                ones++;
            }
            scores[i] = ones * rows + i;
        }

        Arrays.sort(scores);
        for (int i = 0; i < rows; i++) {
            scores[i] = scores[i] % rows;
        }
        System.arraycopy(scores, 0, result, 0, k);
        return result;
    }
}
