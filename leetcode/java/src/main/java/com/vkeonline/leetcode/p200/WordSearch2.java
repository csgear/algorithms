package com.vkeonline.leetcode.p200;

import java.util.*;

/**
 * Leetcode [H]: 212. Word Search II
 * @author csgear
 */
public class WordSearch2 {

    Map<String, Boolean> wordMap;
    Set<String> result;
    boolean[][] visited;
    int m, n;
    int[] dx = { 0, 1, -1, 0 };
    int[] dy = { 1, 0, 0, -1 };

    private void dfs(char[][] board, int x, int y, String word) {
        if (!wordMap.containsKey(word))
            return;

        if (wordMap.get(word))
            result.add(word);

        for (int k = 0; k < 4; k++) {
            int x1 = x + dx[k];
            int y1 = y + dy[k];

            if (x1 < 0 || y1 < 0 || x1 >= m || y1 >= n || visited[x1][y1])
                continue;

            visited[x1][y1] = true;
            dfs(board, x1, y1, word + board[x1][y1]);
            visited[x1][y1] = false;
        }
    }

    private void buildWordMap(String[] words) {
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                String prefix = word.substring(0, i + 1);
                if (!wordMap.containsKey(prefix))
                    wordMap.put(prefix, false);
            }
            wordMap.put(word, true);
        }
    }

    public List<String> findWords(char[][] board, String[] words) {
        if (board == null || board.length == 0
                || board[0] == null || board[0].length == 0)
            return new ArrayList<String>();

        m = board.length;
        n = board[0].length;

        wordMap = new HashMap<>();
        result = new HashSet<>();
        visited = new boolean[m][n];

        buildWordMap(words);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                visited[i][j] = true;
                dfs(board, i, j, String.valueOf(board[i][j]));
                visited[i][j] = false;
            }
        }

        return new ArrayList<>(result);

    }
}
