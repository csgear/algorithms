package com.vkeonline.leetcode.sept;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityNumberIITest {

    @Test
    void majorityElement() {
        MajorityNumberII majorityNumberII = new MajorityNumberII() ;

        int[] nums = {1,2,2,3,2,1,1,3} ;
        System.out.println(majorityNumberII.majorityElement(nums));
    }
}