
package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 36. Valid Sudoku
 * @author csgear
 */
public class ValidSudoku {
    private static final int BOARD_SIZE = 9 ;
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[BOARD_SIZE][BOARD_SIZE] ;
        int[][] cols = new int[BOARD_SIZE][BOARD_SIZE] ;
        int[][] boxes = new int[BOARD_SIZE][BOARD_SIZE] ;

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if(board[i][j] == '.') {
                    continue;
                }

                int current = board[i][j] - '1' ;

                if(rows[i][current] == 1) {
                    return false ;
                }
                rows[i][current] = 1 ;

                if(cols[j][current] == 1) {
                    return false ;
                }
                cols[j][current] = 1 ;

                int idx = (i / 3) * 3 + j / 3 ;
                if(boxes[idx][current] == 1) {
                    return false;
                }
                boxes[idx][current] = 1 ;
            }
        }
        return true ;
    }

}
