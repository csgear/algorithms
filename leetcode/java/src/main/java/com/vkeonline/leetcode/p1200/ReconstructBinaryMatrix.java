

package com.vkeonline.leetcode.p1200;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode [M]: 1253. Reconstruct a 2-Row Binary Matrix
 * @author csgear
 */
public class ReconstructBinaryMatrix {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>>  res = new ArrayList<>() ;

        int sum = 0, twoCol = 0 ;
        for (int col : colsum) {
            if (col == 2) {
                twoCol++;
            }
            sum += col;
        }

        if (sum != upper + lower || Math.min(upper, lower) < twoCol) {
            return res ;
        }

        for (int i = 0; i < 2; i++) {
            res.add(new ArrayList<>());
        }

        upper -= twoCol ;
        lower -= twoCol ;

        for (int col : colsum) {
            if (col == 2) {
                res.get(0).add(1);
                res.get(1).add(1);
            } else if (col == 1) {
                if (upper > 0) {
                    res.get(0).add(1);
                    res.get(1).add(0);
                    --upper;
                } else {
                    res.get(0).add(0);
                    res.get(1).add(1);
                    --lower;
                }
            } else {
                res.get(0).add(0);
                res.get(1).add(0);
            }
        }
        return res;


    }
}
