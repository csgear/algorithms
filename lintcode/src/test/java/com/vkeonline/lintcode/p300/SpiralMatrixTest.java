package com.vkeonline.lintcode.p300;

import org.junit.jupiter.api.Test;

class SpiralMatrixTest {

    @Test
    void spiralOrder() {
        SpiralMatrix spiralMatrix = new SpiralMatrix();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }
}