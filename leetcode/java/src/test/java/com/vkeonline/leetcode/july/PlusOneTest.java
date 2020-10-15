package com.vkeonline.leetcode.july;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {
    PlusOne plusOne = new PlusOne() ;
    @Test
    public void testPlusOne() {
        int[] digits = {9,9,9} ;
        int[] result = plusOne.plusOne(digits) ;
        System.out.println(Arrays.toString(result));
    }
}