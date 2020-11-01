package com.vkeonline.leetcode.year2020.june;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author csgear
 */
public class SurroundedRegions {
    public void surroundedRegions(char[][] board) {
        int n = board.length ;
        if(n == 0) {
            return;
        }

        int m =  board[0].length ;

        for(int i = 0 ; i < n ; i++) {
            bfs(board, i, 0) ;
            bfs(board, i, m - 1) ;
        }
        for(int i = 0 ; i < m ; i++) {
            bfs(board, 0, i) ;
            bfs(board, n-1, i) ;
        }

        for(int i = 0 ; i < n ; i ++) {
            for(int j = 0 ; j < m ; j++) {
                if(board[i][j] == 'W') {
                    board[i][j] = 'O' ;
                }
                else {
                    board[i][j] = 'X' ;
                }
            }
        }
    }

    private void bfs(char[][] board, int sx, int sy) {
        if(board[sx][sy] != 'O') {
            return ;
        }

        int n = board.length ;
        int m = board[0].length ;
        int[] dx = {0, 1, 0, -1} ;
        int[] dy = {1, 0, -1, 0} ;

        Queue<Integer> qx = new LinkedList<>() ;
        Queue<Integer> qy = new LinkedList<>() ;

        qx.offer(sx) ;
        qx.offer(sy) ;
        board[sx][sy] = 'W' ;
        while(! qx.isEmpty()) {
            int cx = qx.poll() ;
            int cy = qy.poll() ;
            for(int i = 0 ; i < dx.length ; i++) {
                int nx = cx + dx[i] ;
                int ny = cy + dy[i] ;
                if(nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 'O') {
                    board[nx][ny] = 'W' ;
                    qx.offer(nx) ;
                    qy.offer(ny) ;
                }
            }
        }
    }
}
