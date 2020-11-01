package com.vkeonline.leetcode.year2020.april;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchingRotatedSortedArrayTest {

    @Test
    void search() {
        SearchingRotatedSortedArray sa = new SearchingRotatedSortedArray() ;
        int[] nums = {4,5,6,7,0,1,2} ;
        int  target = 0 ;
        assertEquals(4,sa.Search(nums, 0)) ;
    }
}