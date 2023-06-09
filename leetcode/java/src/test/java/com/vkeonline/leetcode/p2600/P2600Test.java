package com.vkeonline.leetcode.p2600;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P2600Test {

    @Test
    void testMiceAndCheese() {
        MouseCheese mouseCheese = new MouseCheese() ;
        int[] reward1 = {1,1,3,4} ;
        int[] reward2 = {4,4,1,1} ;
        int k = 2 ;
        int expected = 15 ;
        assertEquals(expected, mouseCheese.miceAndCheese(reward1, reward2, k));
    }
}