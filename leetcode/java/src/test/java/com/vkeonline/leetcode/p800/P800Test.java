package com.vkeonline.leetcode.p800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Xiaojun.Yang
 */
class P800Test {

    @Test
    void mirrorReflection() {
        MirrorReflection mirrorReflection = new MirrorReflection() ;
        int p = 2 ;
        int q = 1 ;
        int expected = 2 ;
        assertEquals(expected, mirrorReflection.mirrorReflection(p, q));
    }
}