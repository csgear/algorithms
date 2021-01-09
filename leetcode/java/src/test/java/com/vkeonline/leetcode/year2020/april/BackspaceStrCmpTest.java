package com.vkeonline.leetcode.year2020.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStrCmpTest {

    @Test
    void backspaceCompare() {
        BackspaceStrCmp bs = new BackspaceStrCmp() ;
        String S = "ab##" ;
        String T = "c#d#" ;
        boolean result = bs.backspaceCompare(S, T) ;
        assertTrue(result);

    }
}