package com.vkeonline.leetcode.year2020.july;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class PlusOneTest {
    PlusOne plusOne = new PlusOne() ;
    @Test
    public void testPlusOne() {
        int[] digits = {9,9,9} ;
        int[] result = plusOne.plusOne(digits) ;
        System.out.println(Arrays.toString(result));
    }
}