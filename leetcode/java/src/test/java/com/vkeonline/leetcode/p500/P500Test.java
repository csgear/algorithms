package com.vkeonline.leetcode.p500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P500Test {

    @Test
    void testNumberOfProvinces() {
        NumberOfProvinces numberOfProvinces = new NumberOfProvinces() ;
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}} ;
        int expected =2 ;
        assertEquals(expected,numberOfProvinces.findCircleNum(isConnected));
    }

    @Test
    void minDistance() {
        DeleteOperationTwoStrings deleteOperationTwoStrings = new DeleteOperationTwoStrings() ;
        String word1 = "sea", word2 = "eat" ;
        int expected = 2 ;
        assertEquals(expected, deleteOperationTwoStrings.minDistance(word1, word2));
    }
}