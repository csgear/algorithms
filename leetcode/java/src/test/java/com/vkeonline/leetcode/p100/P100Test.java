package com.vkeonline.leetcode.p100;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class P100Test {

    @Test
    void findMin() {
        FindMinimumRotatedSortedArray findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArray() ;
        int[] nums = {11,13,15,17} ;
        int expected = 11 ;
        assertEquals(expected, findMinimumRotatedSortedArray.findMin(nums));
    }

    @Test
    void findMissingRangesTestCase1() {
        int[] nums = {0,1,3,50,75} ;
        int lower = 0, upper = 99 ;

        MissingRanges missingRanges = new MissingRanges() ;
        List<String> result =  missingRanges.findMissingRanges(nums, lower, upper) ;
        List<String> expected = Arrays.asList("2","4->49","51->74","76->99") ;
        assertEquals(result, expected);
    }

    @Test
    void permutation2TestCase1() {
        Permutation2 permutation2 = new Permutation2() ;
        int[] nums = {1,2,3} ;
        permutation2.permuteUnique(nums).forEach(System.out::println);
    }

    @Test
    void findPeakElement() {
        FindPeakElement findPeakElement = new FindPeakElement() ;
        int[] nums = {1,2,3,1} ;
        int expected = 2 ;
        assertEquals(expected, findPeakElement.findPeakElement(nums));
    }

    @Test
    void rob() {
        HouseRobber houseRobber = new HouseRobber() ;
        int[] nums = {1,2,3,1} ;
        int expected = 4 ;
        assertEquals(expected, houseRobber.rob(nums));
    }
}
