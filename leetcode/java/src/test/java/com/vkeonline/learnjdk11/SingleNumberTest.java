package com.vkeonline.learnjdk11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    @Test
    void singleNumber() {
        SingleNumber sn = new SingleNumber() ;
        int[] numbers = {4,1,2,1,2} ;
        System.out.println(sn.singleNumber(numbers)) ;
    }
}