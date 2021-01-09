package com.vkeonline.leetcode.year2020.may;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author csgear
 * Leetcode: 886. Possible Bipartition
 */
public class PossibleBipartition {
    ArrayList<Integer>[] graph  ;
    Map<Integer, Integer> color ;

    public boolean possibleBipartition(int N, int[][] dislikes) {
        graph = new ArrayList[N+1] ;
        for(int i = 1 ; i <= N ; ++i) {
            graph[i] = new ArrayList<>() ;
        }

        for(int[] edge : dislikes) {
            graph[edge[0]].add(edge[1]) ;
            graph[edge[1]].add(edge[0]) ;
        }

        color = new HashMap<>() ;
        for(int node = 1 ; node <= N ; node++) {
            if(!color.containsKey(node) && !dfs(node, 0)) {
                return  false ;
            }
        }

        return true ;
    }

    private boolean dfs(int node, int color) {
        if(this.color.containsKey(node)) {
            return this.color.get(node) == color ;
        }
        this.color.put(node, color) ;

        for(int neighbour: graph[node]) {
            if(! dfs(neighbour, color^1)) {
                return false ;
            }
        }

        return true ;
    }
}
