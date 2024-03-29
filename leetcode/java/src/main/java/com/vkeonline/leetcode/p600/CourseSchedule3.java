package com.vkeonline.leetcode.p600;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Leetcode [H]: 630. Course Schedule III
 * @author csgear
 */
public class CourseSchedule3 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(a -> a[1]));
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        int time = 0;
        for (int[] c : courses) {
            if (time + c[0] <= c[1]) {
                queue.offer(c[0]);
                time += c[0];
            } else if (!queue.isEmpty() && queue.peek() > c[0]) {
                time += c[0] - queue.poll();
                queue.offer(c[0]);
            }
        }
        return queue.size();
    }
}
