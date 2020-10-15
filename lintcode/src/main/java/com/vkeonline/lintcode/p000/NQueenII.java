package com.vkeonline.lintcode.p000;

/**
 * Lintcode: 34. N-Queens II
 *
 * @author csgear
 */
public class NQueenII {
    public static int sum = 0;

    public int totalNQueens(int n) {
        sum = 0;
        int[] usedCols = new int[n];
        dfs(usedCols, 0);
        return sum;
    }

    private void dfs(int[] usedCols, int row) {
        int n = usedCols.length;
        if (row == n) {
            sum++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (isValid(usedCols, row, i)) {
                usedCols[row] = i;
                dfs(usedCols, row + 1);
            }
        }
    }

    private boolean isValid(int[] usedCols, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (usedCols[i] == col) {
                return false;
            }

            if ((row - i) == Math.abs(col - usedCols[i])) {
                return false;
            }
        }
        return true;
    }
}
