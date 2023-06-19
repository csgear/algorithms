package com.vkeonline.leetcode.p700;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Leetcode [E]: 504. Base 7
 * @author xiaojun.yang
 */
class P500Test {

    @Test
    void convertToBase7() {
        Base7 base7 = new Base7() ;
        int num = -7 ;
        String expected = "-10" ;
        assertEquals(expected, base7.convertToBase7(num));
    }
}