package com.vkeonline.leetcode.p200;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/**
 * Leetcode [M]: 207. Course Schedule
 *
 * @author csgear
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] edge: prerequisites) {
            graph[edge[1]].add(edge[0]);
            inDegree[edge[0]]++;
        }

        int numChoose = 0;
        Queue<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < inDegree.length; i++){
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        while (! queue.isEmpty()) {
            int now = queue.poll();
            numChoose++;

            for (int i = 0; i < graph[now].size(); i++) {
                int nxt = graph[now].get(i);
                inDegree[nxt]--;
                if (inDegree[nxt] == 0) {
                    queue.add(nxt);
                }
            }
        }

        return numChoose == numCourses ;
    }
}
