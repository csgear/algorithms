package com.vkeonline.learnjdk11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackspaceStrCmpTest {

    @Test
    void backspaceCompare() {
        BackspaceStrCmp bs = new BackspaceStrCmp() ;
        String S = "ab##" ;
        String T = "c#d#" ;
        boolean result = bs.backspaceCompare(S, T) ;
        assertEquals(true, result);

    }
}