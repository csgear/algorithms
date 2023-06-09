package com.vkeonline.leetcode.p1200;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P1200Test {

    @Test
    void testTilingRectangle() {
        TilingRectangleFewestSquares tilingRectangleFewestSquares = new TilingRectangleFewestSquares() ;
        int n = 5, m = 8 ;
        int expected =  5 ;
        assertEquals(expected, tilingRectangleFewestSquares.tilingRectangle(n, m));
    }
}