package com.vkeonline.leetcode.p900;

/**
 * Leetcode [M]: 957. Prison Cells After N Days
 * @author csgear
 */
public class PrisonCells {
    public int[] prisonAfterNDays(int[] cells, int N) {
        N = N % 14 == 0 ? 14 : N % 14;
        for(int j = 1; j <= N; j++){
            int prev = cells[0];
            cells[0] = 0;
            for(int i = 1; i < 7; i++){
                int temp = cells[i];
                cells[i] = prev == cells[i + 1] ? 1 : 0;
                prev = temp;
            }
            cells[7] = 0;
        }
        return cells;
    }
}
