package com.vkeonline.leetcode.p200;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class P200Test {

    @Test
    void minSubArrayLen() {
        MinimumSizeSubarraySum minimumSizeSubarraySum = new MinimumSizeSubarraySum() ;
        int target = 7 ;
        int[] nums = {2,3,1,2,4,3} ;
        int expected =  2 ;
        assertEquals(expected, minimumSizeSubarraySum.minSubArrayLen(target, nums));
    }

    @Test
    void findOrder() {
        CourseScheduleII courseScheduleII = new CourseScheduleII() ;
        int numCourses = 4 ;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}} ;
        int[] expected = {0,2,1,3} ;
        Arrays.sort(expected) ;
        int[] result = courseScheduleII.findOrder(numCourses, prerequisites) ;
        Arrays.sort(result);
        assertEquals(expected.length, result.length);
        assertArrayEquals(expected, result);
    }
}
