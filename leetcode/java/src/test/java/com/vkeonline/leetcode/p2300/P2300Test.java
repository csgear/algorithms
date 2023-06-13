package com.vkeonline.leetcode.p2300;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P2300Test {

    @Test
    void testEqualPairs() {
        EqualRowColumnPairs equalRowColumnPairs = new EqualRowColumnPairs() ;
        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}} ;
        int expected = 1 ;
        assertEquals(expected, equalRowColumnPairs.equalPairs(grid));
    }
}