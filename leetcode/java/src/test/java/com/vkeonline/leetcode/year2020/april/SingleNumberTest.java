package com.vkeonline.leetcode.year2020.april;

import org.junit.jupiter.api.Test;

class SingleNumberTest {

    @Test
    void singleNumber() {
        SingleNumber sn = new SingleNumber() ;
        int[] numbers = {4,1,2,1,2} ;
        System.out.println(sn.singleNumber(numbers)) ;
    }
}