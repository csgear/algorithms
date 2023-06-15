

package com.vkeonline.leetcode.p700;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Leetcode [M]:
 * @author csgear
 */
public class AllPathFromSourceToTarget {
    List<List<Integer>> ans = new ArrayList<>() ;
    Deque<Integer> currentPath = new ArrayDeque<>() ;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        currentPath.offerLast(0);
        dfs(graph, 0, graph.length - 1 ) ;
        return ans ;
    }

    private void dfs(int[][] graph, int current, int n) {
        if(current == n) {
            ans.add(new ArrayList<>(currentPath));
            return ;
        }

        for(int next: graph[current]) {
            currentPath.offerLast(next) ;
            dfs(graph, next, n) ;
            currentPath.pollLast() ;
        }
    }
}
