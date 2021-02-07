package com.vkeonline.leetcode.year2021.feb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceCharTest {

    @Test
    void shortestToChar() {
        ShortestDistanceChar shortestDistanceChar = new ShortestDistanceChar() ;
        String s = "loveleetcode" ;
        char c = 'e' ;
        int[] expected = {3,2,1,0,1,0,0,1,2,2,1,0} ;
        assertArrayEquals(expected, shortestDistanceChar.shortestToChar(s, c)) ;

    }
}