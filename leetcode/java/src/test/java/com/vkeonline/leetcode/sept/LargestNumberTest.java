package com.vkeonline.leetcode.sept;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {

    @Test
    void largestNumber() {
        LargestNumber largestNumber = new LargestNumber() ;

        int[] nums =  {3,30,34,5,9} ;

        System.out.println(largestNumber.largestNumber(nums)) ;
    }
}