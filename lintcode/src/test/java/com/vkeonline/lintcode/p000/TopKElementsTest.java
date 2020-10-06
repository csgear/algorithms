package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.p1200.TopKElements;
import org.junit.jupiter.api.Test;

class TopKElementsTest {

    @Test
    void topKFrequent1() {
        TopKElements topKElements = new TopKElements() ;
        int[] nums = {1,1,1,2,2,3} ;
        int k = 2 ;

        System.out.println(topKElements.topKFrequent(nums, k));
    }
}