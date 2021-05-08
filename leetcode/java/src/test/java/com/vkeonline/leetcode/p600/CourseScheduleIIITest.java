package com.vkeonline.leetcode.p600;

import com.vkeonline.leetcode.p200.CourseScheduleII;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseScheduleIIITest {

    CourseScheduleIII courseScheduleIII = new CourseScheduleIII() ;

    @Test
    void scheduleCourse() {
        int[][] courses1 = {{100,200},{200,1300},{1000,1250},{2000,3200}} ;
        int expected, result ;
        expected= 3 ;
        result = courseScheduleIII.scheduleCourse(courses1) ;
        assertEquals(expected, result);
        int[][] courses2 = {{5,5},{4,6},{2,6}} ;
        expected = 2 ;
        result = courseScheduleIII.scheduleCourse(courses2) ;
        assertEquals(expected, result);
    }

}