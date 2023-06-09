
package com.vkeonline.leetcode.p1200;

/**
 * Leetcode [H]: 1240. Tiling a Rectangle with the Fewest Squares
 * @author csgear
 */
public class TilingRectangleFewestSquares {
    private int result = 0 ;
    public int tilingRectangle(int n, int m) {
        boolean[][] covered = new boolean[n][m] ;
        result = m * n;
        dfs(covered, 0);
        return result ;
    }

    private void dfs(boolean[][] covered, int k) {
        if(k >= result) {
            return ;
        }

        int[] emptyPos = checkEmpty(covered);

        if (emptyPos[0] == -1 && emptyPos[1] == -1) {
            result = Math.min(result, k);
            return;
        }

        int maxLen = Math.min(covered.length - emptyPos[0],
                covered[0].length - emptyPos[1]);

        for (int len = maxLen; len >= 1; len--) {
            if (setStatus(
                    covered,
                    emptyPos[0], emptyPos[1], emptyPos[0] + len - 1, emptyPos[1] + len - 1,
                    false)) {
                dfs(covered, k + 1);
                setStatus(
                        covered,
                        emptyPos[0], emptyPos[1], emptyPos[0] + len - 1, emptyPos[1] + len - 1,
                        true);

            }
        }
    }

    private boolean setStatus(boolean[][] covered,
            int row1, int col1, int row2, int col2,
            boolean hasTiled) {
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                if (covered[i][j] != hasTiled) {
                    return false;
                }
            }
        }
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                covered[i][j] = !covered[i][j];
            }
        }
        return true;

    }

    private int[] checkEmpty(boolean[][] covered) {
        for (int i = 0; i < covered.length; i++) {
            for (int j = 0; j < covered[0].length; j++) {
                if (!covered[i][j]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
