package com.vkeonline.leetcode.p200;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode: 210. Course Schedule II
 * @author csgear
 */
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<Integer>[] graph = new ArrayList[numCourses] ;
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>() ;
        }
        int[] indegree = new int[numCourses] ;
        for(int[] p: prerequisites) {
            graph[p[1]].add(p[0]) ;
            indegree[p[0]] += 1 ;
        }
        int[] order = new int[numCourses] ;
        int index = 0 ;
        Queue<Integer> queue = new LinkedList<>() ;
        for (int i = 0; i < numCourses; i++) {
            if(indegree[i] == 0) {
                queue.add(i) ;
                order[index++] = i ;
            }
        }
        while(!queue.isEmpty()) {
            int current = queue.poll() ;
            for(int c : graph[current]) {
                indegree[c]-- ;
                if(indegree[c] == 0) {
                    queue.add(c) ;
                    order[index++] = c ;
                }
            }
        }
        return index == numCourses ? order : new int[0];
    }
}
