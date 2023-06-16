package com.vkeonline.leetcode.p600;

import java.util.List;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author xiaojun.yang
 */
class P600Test {

    @Test
    void scheduleCourse() {
        CourseSchedule3 courseSchedule3 = new CourseSchedule3() ;

        int[][] courses1 = {{100,200},{200,1300},{1000,1250},{2000,3200}} ;
        int expected, result ;
        expected= 3 ;
        result = courseSchedule3.scheduleCourse(courses1) ;
        assertEquals(expected, result);
        int[][] courses2 = {{5,5},{4,6},{2,6}} ;
        expected = 2 ;
        result = courseSchedule3.scheduleCourse(courses2) ;
        assertEquals(expected, result);
    }

    @Test
    void find24() {
        int[] cards = {4, 1, 8, 7} ;
        TwentyFourGame.find24(cards, "");
    }

    @Test
    void judgePoint24() {
        TwentyFourGame twentyFourGame = new TwentyFourGame() ;
        int[] cards = {4, 1, 8, 7} ;
        assertTrue(twentyFourGame.judgePoint24(cards));
        cards = new int[]{ 1, 2, 1, 2 };
        assertFalse(twentyFourGame.judgePoint24(cards));
    }

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