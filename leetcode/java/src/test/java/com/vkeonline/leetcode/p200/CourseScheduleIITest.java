package com.vkeonline.leetcode.p200;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIITest {

    @Test
    void findOrder() {
        CourseScheduleII courseScheduleII = new CourseScheduleII() ;
        int numCourses = 4 ;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}} ;
        int[] expected = {0,2,1,3} ;
        assertEquals(expected.length, courseScheduleII.findOrder(numCourses, prerequisites).length);
    }
}