package com.vkeonline.lintcode.p500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum4Test {
    CombinationSum4 combinationSum4 = new CombinationSum4() ;

    @Test
    void backPackVI() {
        int[] nums = {1, 2, 4} ;
        int target = 4 ;
        int expected = 6 ;
        assertEquals(expected, combinationSum4.backPackVI(nums, target));
    }
}