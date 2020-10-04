package com.vkeonline.leetcode.oct;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KDiffPairsTest {

    @Test
    void findPairs() {
        int[] nums = {1,2,3,4,5};
        int k = 1 ;
        KDiffPairs kDiffPairs = new KDiffPairs() ;
        System.out.println(kDiffPairs.findPairs(nums, k));
    }
}