package com.vkeonline.leetcode.year2020.dec;

import com.vkeonline.leetcode.p400.DiagonalTraverse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DiagonalTraverseTest {

    @Test
    void findDiagonalOrder() {
        DiagonalTraverse diagonalTraverse = new DiagonalTraverse() ;

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] expected = {1, 2, 4, 7, 5, 3, 6, 8, 9};

        assertArrayEquals(expected, diagonalTraverse.findDiagonalOrder(matrix));

    }
}