package com.vkeonline.leetcode.p600;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P600Test {

    @Test
    void topKFrequent() {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"} ;
        int k = 4 ;
        String[] expected = {"the","is","sunny","day"} ;
        TopKFrequentWords topKFrequentWords = new TopKFrequentWords() ;
        assertArrayEquals(expected,
                topKFrequentWords.topKFrequent(words, k).toArray());

    }

    @Test
    void maxDistance() {
        MaxDistanceInArrays maxDistanceInArrays = new MaxDistanceInArrays() ;
        List<List<Integer>> input = List.of(
                List.of(1,2,3),
                List.of(4,5),
                List.of(1,2,3)
        ) ;
        int expected = 4 ;
        assertEquals(expected, maxDistanceInArrays.maxDistance(input));
    }
}