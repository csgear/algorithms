package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

class Search2DMatrixTest {

    @Test
    void searchMatrix() {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50},
        };
        int target = 3;

        System.out.println(search2DMatrix.searchMatrix(matrix, target));
    }
}