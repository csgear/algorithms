package com.vkeonline.leetcode.year2020.sept;

import org.junit.jupiter.api.Test;

class LargestNumberTest {

    @Test
    void largestNumber() {
        LargestNumber largestNumber = new LargestNumber() ;

        int[] nums =  {3,30,34,5,9} ;

        System.out.println(largestNumber.largestNumber(nums)) ;
    }
}