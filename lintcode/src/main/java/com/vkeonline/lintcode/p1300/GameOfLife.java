package com.vkeonline.lintcode.p1300;

/**
 * Lint code: 1301. Game of Life
 *
 * @author csgear
 */
public class GameOfLife {
    /**
     * we need to take care of the current state and next state
     *
     * @param board
     */
    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) {
            return;
        }
        int m = board.length, n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = liveNeighbors(board, m, n, i, j);
                // Any live cell with two or three live neighbors lives on to the next generation.
                if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
                    board[i][j] = 3;
                }

                // Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] >>= 1;
            }
        }
    }

    private int liveNeighbors(int[][] board, int m, int n, int i, int j) {
        int lives = 0;

        for (int x = Math.max(i - 1, 0); x <= Math.min(i + 1, m - 1); x++) {
            for (int y = Math.max(j - 1, 0); y <= Math.min(j + 1, n - 1); y++) {
                lives += board[x][y] & 1;
            }
        }

        lives -= board[i][j] & 1;

        return lives;
    }
}
