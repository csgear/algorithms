package com.vkeonline.leetcode.year2020.april;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.vkeonline.leetcode.p800.BackspaceStrCmp;
import org.junit.jupiter.api.Test;

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
