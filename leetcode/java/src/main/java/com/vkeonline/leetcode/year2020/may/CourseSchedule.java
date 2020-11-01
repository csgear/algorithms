package com.vkeonline.leetcode.year2020.may;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author csgear
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int[] edge: prerequisites) {
            graph[edge[1]].add(edge[0]);
            inDegree[edge[0]]++;
        }

        int numChoose = 0;
        Queue queue = new LinkedList();

        for(int i = 0; i < inDegree.length; i++){
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (! queue.isEmpty()) {
            int now = (int)queue.poll();
            numChoose++;

            for (int i = 0; i < graph[now].size(); i++) {
                int nxt = (int)graph[now].get(i);
                inDegree[nxt]--;
                if (inDegree[nxt] == 0) {
                    queue.add(nxt);
                }
            }
        }

        return numChoose == numCourses ;
    }
}
