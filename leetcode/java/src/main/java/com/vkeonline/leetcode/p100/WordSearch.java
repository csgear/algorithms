package com.vkeonline.leetcode.p100;

/**
 * @author csgear
 */
public class WordSearch {

    private boolean dfs(char[][] board, int i, int j, String word, int len) {
        if (len == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(len)) {
            return false;
        }

        boolean result;

        board[i][j] = '#';

        result = dfs(board, i + 1, j, word, len + 1) ||
                dfs(board, i - 1, j, word, len + 1) ||
                dfs(board, i, j - 1, word, len + 1) ||
                dfs(board, i, j + 1, word, len + 1);

        board[i][j] = word.charAt(len);

        return result;
    }

    int m, n;

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0) {
            return false;
        }
        if ("".equals(word)) {
            return true;
        }

        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}

