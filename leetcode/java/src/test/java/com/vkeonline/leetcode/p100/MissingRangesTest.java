package com.vkeonline.leetcode.p100;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MissingRangesTest {

    @Test
    void findMissingRanges() {
        int[] nums = {0,1,3,50,75} ;
        int lower = 0, upper = 99 ;

        MissingRanges missingRanges = new MissingRanges() ;

        List<String> result =  missingRanges.findMissingRanges(nums, lower, upper) ;

        List<String> expected = Arrays.asList("2","4->49","51->74","76->99") ;

        assertEquals(result, expected);
    }
}