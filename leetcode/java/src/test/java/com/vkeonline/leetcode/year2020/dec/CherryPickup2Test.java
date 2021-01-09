package com.vkeonline.leetcode.year2020.dec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CherryPickup2Test {

    @Test
    void cherryPickup() {
        int[][] grid = {
                {1, 0, 0, 0, 0, 0, 1},
                {2, 0, 0, 0, 0, 3, 0},
                {2, 0, 9, 0, 0, 0, 0},
                {0, 3, 0, 5, 4, 0, 0},
                {1, 0, 2, 3, 0, 0, 6}
        };

        CherryPickup2 cherryPickup2 = new CherryPickup2() ;

        int expected = 28 ;

        assertEquals(expected, cherryPickup2.cherryPickup(grid)) ;
    }
}