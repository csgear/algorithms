package com.vkeonline.leetcode.p000;

import java.util.Arrays;
import java.util.Collections;

/**
 * Leetcode [M]: 48. Rotate Image
 * @author csgear
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int elem = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = elem;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int elem = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = elem;
            }
        }

        for (int i = 0; i < n; i++) {
            Collections.reverse(Arrays.asList(matrix[i])) ;
        }
    }
}
