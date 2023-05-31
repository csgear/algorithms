package com.vkeonline.leetcode.year2020.april;

import com.vkeonline.leetcode.p200.HappyNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {

    @Test
    void isHappy() {
        HappyNumber hn = new HappyNumber() ;
        int n = 19 ;
        boolean result = hn.isHappy(n) ;
        assertEquals(true, result);

        System.out.println(hn.isHappy(n));
    }
}