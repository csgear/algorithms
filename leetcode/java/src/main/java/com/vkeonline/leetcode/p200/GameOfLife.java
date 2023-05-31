

package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 289. Game of Life
 * @author csgear
 */
public class GameOfLife {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = board[i][j] == 1 ? -1 : 0;

                for (int r = -1; r < 2; r++) {
                    for (int c = -1; c < 2; c++) {
                        int rr = i + r;
                        int cc = j + c;
                        if ((rr < m && rr >= 0) && (cc < n && cc >= 0) && (Math.abs(board[rr][cc]) == 1)) {
                            count++;
                        }
                    }
                }
                if (board[i][j] == 1 && (count < 2 || count > 3))
                    board[i][j] = -1;

                if (board[i][j] == 0 && count == 3)
                    board[i][j] = 2;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;
                } else {
                    board[i][j] = 0;
                }
            }
        }
    }

    public void gameOfLife1(int[][] board) {
        int m = board.length;
        if (m == 0) {
            return;
        }
        int n = board[0].length;
        if (n == 0) {
            return;
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int cnt = cntLiveCell(i, j, board);
                // save count to higher bit
                board[i][j] = board[i][j] | (cnt << 1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // old value
                int cell = board[i][j] & 1;
                // count of live cells
                int cnt = board[i][j] >> 1;
                if (cell == 0 && cnt == 3) {
                    board[i][j] = 1;
                } else if (cell == 1 && (cnt > 3 || cnt < 2)) {
                    board[i][j] = 0;
                }
                else {
                    board[i][j] = cell ;
                }
            }
        }
    }

    private int cntLiveCell(int i, int j,
            int[][] board) {
        int cnt = 0;
        int[][] directions = {
                {0, 1},
                {0, -1},
                {-1, 0},
                {1, 0},
                {1, 1},
                {1, -1},
                {-1, 1},
                {-1, -1}
        };
        int m = board.length, n = board[0].length;
        for (int p = 0; p < 8; p++) {
            int dx = directions[p][0], dy = directions[p][1];
            if (i + dx >= 0 && i + dx < m && j + dy >= 0 &&
                    j + dy < n)
                cnt += board[i + dx][j + dy] & 1;
        }
        return cnt;
    }
}
