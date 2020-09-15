package com.vkeonline.lintcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKElementsTest {

    @Test
    void topKFrequent1() {
        TopKElements topKElements = new TopKElements() ;
        int[] nums = {1,1,1,2,2,3} ;
        int k = 2 ;

        System.out.println(topKElements.topKFrequent(nums, k));
    }
}