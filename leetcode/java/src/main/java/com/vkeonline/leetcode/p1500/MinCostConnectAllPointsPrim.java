

package com.vkeonline.leetcode.p1500;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Leetcode [M]: 1584. Min Cost to Connect All Points
 * @author csgear
 */
public class MinCostConnectAllPointsPrim {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(
                Comparator.comparingInt(x -> x[2])
        ) ;
        int n = points.length ;
        int ans = 0 ;
        for (int i = 1; i < n; i++) {
            int[] cord0 = points[0] ;
            int[] cord1 = points[i] ;
            int dist = Math.abs(cord0[0] - cord1[0]) +
                    Math.abs(cord0[1] - cord1[1]);
            queue.offer(new int[]{0, i, dist}) ;
        }
        boolean[] visited = new boolean[n];
        visited[0] = true ;
        int count = 1 ;

        while(! queue.isEmpty() && count < n) {
            int[] e = queue.poll() ;
            int p2 = e[1] ;
            int dist = e[2] ;
            if(!visited[p2]) {
                ans += dist ;
                visited[p2] = true ;
                for (int j = 0; j < n; j++ ) {
                    if ( !visited[j] ) {
                        int cost = Math.abs(
                                points[p2][0] - points[j][0]
                        ) + Math.abs(points[p2][1] - points[j][1]);
                        queue.offer(new int[] {p2, j, cost}) ;
                    }
                }
                count++ ;
            }
        }
        return ans ;
    }
}
