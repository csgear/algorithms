package com.vkeonline.leetcode.p600;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Leetcode: Course Schedule III
 * @author csgear
 */
public class CourseScheduleIII {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1])) ;
        PriorityQueue<int[]> heap = new PriorityQueue<>( (a,b) -> b[0] - a[0]) ;
        int currentTime = 0 ;
        for (int[] course : courses) {
            currentTime += course[0];
            heap.add(course);
            if (currentTime > course[1]) {
                currentTime -= heap.poll()[0];
            }
        }
        return heap.size() ;
    }
}
