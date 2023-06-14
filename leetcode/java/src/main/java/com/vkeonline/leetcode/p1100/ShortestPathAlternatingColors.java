

package com.vkeonline.leetcode.p1100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/**
 * Leetcode [M]: 1129. Shortest Path with Alternating Colors
 * @author csgear
 */
public class ShortestPathAlternatingColors {
    public int[] shortestAlternatingPaths(int n, int[][] redEdges,
            int[][] blueEdges) {
        // build adjacent edge list
        List<Integer>[][] graph = new ArrayList[2][n] ;

        for(var edge: graph) {
            Arrays.setAll(edge, k -> new ArrayList<>());
        }

        for(var e: redEdges) {
            graph[0][e[0]].add(e[1]);
        }

        for(var e: blueEdges) {
            graph[1][e[0]].add(e[1]);
        }

        Queue<int[]> q = new ArrayDeque<>();

        q.offer(new int[] {0, 0}) ;
        q.offer(new int[] {0, 1}) ;
        boolean[][] visited = new boolean[n][2] ;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        int d = 0;
        while(!q.isEmpty()) {
            // evaluate k = q.size() a single layer of a graph
            for (int k = q.size(); k > 0; --k) {
                var p = q.poll() ;
                int node = p[0], color = p[1] ;
                if(ans[node] == -1) {
                    ans[node] = d ;
                }
                visited[node][color] = true ;

                // flip color
                color ^= 1 ;

                for(int j: graph[color][node]) {
                    if(! visited[j][color]) {
                        q.offer(new int[] {j, color});
                    }
                }
            }
            ++d ;
        }

        return ans;
    }
}
