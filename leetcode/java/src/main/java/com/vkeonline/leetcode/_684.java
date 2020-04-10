package com.vkeonline.leetcode;

public class _684 {
    class Solution {
        public int[] findRedundantConnection(int[][] edges) {
            if (edges.length == 0) return new int[] {} ;

            int n = edges.length + 1 ;

            UnionFindSet s = new UnionFindSet(n) ;

            for(int i = 0 ; i < edges.length ; i++) {
                if(s.union(edges[i][0], edges[i][1]) == false) {
                    return new int[]{edges[i][0], edges[i][1]};
                }
            }

            return new int[] {} ;
        }
    }
}
