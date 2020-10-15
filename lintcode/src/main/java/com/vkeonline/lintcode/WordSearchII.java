package com.vkeonline.lintcode;

import java.util.*;

/**
 * Lintcode: 132. Word Search II
 * @author csgear
 */
public class WordSearchII {
    final static int[] DX = {0, 1, -1, 0 } ;
    final static int[] DY = {1, 0, 0, -1} ;

    public List<String> wordSearchII(char[][] board, List<String> words) {
        if (board == null || board.length == 0) {
            return new ArrayList<>();
        }
        if (board[0] == null || board[0].length == 0) {
            return new ArrayList<>();
        }

        boolean[][] visited = new boolean[board.length][board[0].length];
        Map<String, Boolean> prefixMap = generatePrefixSet(words);
        Set<String> resultSet = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                visited[i][j] = true;
                dfs(board, visited, i, j, String.valueOf(board[i][j]), prefixMap, resultSet);
                visited[i][j] = false;
            }
        }

        return new ArrayList<>(resultSet) ;
    }

    private Map<String, Boolean>  generatePrefixSet(List<String> words) {
        Map<String, Boolean> prefixMap = new HashMap<>() ;

        for(String word: words) {
            for (int i = 0; i < word.length() - 1; i++) {
                String prefix = word.substring(0, i+1) ;
                if(!prefixMap.containsKey(prefix)) {
                    prefixMap.put(prefix, false) ;
                }
            }
            prefixMap.put(word, true) ;
        }
        return prefixMap ;
    }

    private void dfs(char[][] board, boolean[][] visited,
                     int x, int y, String current, Map<String, Boolean> prefixMap, Set<String> resultSet) {
        if(! prefixMap.containsKey(current))  {
            return ;
        }

        if(prefixMap.get(current)) {
            resultSet.add(current) ;
        }

        for(int i = 0 ; i < 4 ; i++) {
            int newX = x + DX[i] ;
            int newY = y + DY[i] ;

            if(! isValid(board, newX, newY) || visited[newX][newY]) {
                continue;
            }

            visited[newX][newY] = true ;
            dfs(board, visited, newX, newY, current + board[newX][newY], prefixMap, resultSet) ;
            visited[newX][newY] = false ;
        }
    }

    private boolean isValid(char[][] board, int x, int y) {
        return x >= 0 && y >= 0 && x < board.length && y < board[0].length ;
    }
}
