package com.vkeonline.leetcode.year2020.oct;

import org.junit.jupiter.api.Test;

class BinarySearchTest {

    @Test
    void search() {
        BinarySearch binarySearch = new BinarySearch() ;

//        int[] nums = {-1,0,3,5,9,12, 13} ;
        int[] nums = {2,5} ;
        int target = 5 ;

        System.out.println(binarySearch.search(nums, target));
    }
}