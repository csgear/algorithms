package com.vkeonline.leetcode.p200;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode: 210. Course Schedule II
 * @author csgear
 */
public class CourseScheduleIIDfs {
    private final List<List<Integer>> edges = new ArrayList<>();
    // 0:not visited, 1: visiting,  2: visited
    private int[] visited;
    private int[] result ;
    private boolean valid = true;
    private int index ;

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        for (int i = 0; i < numCourses; i++) {
            edges.add(new ArrayList<>()) ;
        }

        visited = new int[numCourses];
        result = new int[numCourses];
        index = numCourses - 1;

        for (int[] info : prerequisites) {
            edges.get(info[1]).add(info[0]);
        }

        for (int i = 0; i < numCourses && valid; ++i) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }

        if (!valid) {
            return new int[0];
        }

        return result ;
    }

    private void dfs(int u) {
        visited[u] = 1 ;
        for (int v: edges.get(u)) {
            if (visited[v] == 0) {
                dfs(v);
                if (!valid) {
                    return;
                }
            } else if (visited[v] == 1) {
                valid = false;
                return;
            }
        }
        visited[u] = 2 ;
        result[index--] = u;
    }
}
