package com.vkeonline.leetcode.year2020.april;

import java.util.List;

interface BinaryMatrix {
     int get(int x, int y) ;
     List<Integer> dimensions() ;
 }

/**
 * @author csgear
 */
public class LeftMostColumnWithOne {
    public int leftMostColumnWithOne(BinaryMatrix matrix) {
        int rows = matrix.dimensions().get(0);
        int cols = matrix.dimensions().get(1);

        int candidate = -1;
        for (int r = 0, c = cols - 1; r < rows && c >= 0; ) {
            if (matrix.get(r, c) == 1) {
                candidate = c;
                c--;
            } else {
                r++;
            }
        }
        return candidate;
    }
}
