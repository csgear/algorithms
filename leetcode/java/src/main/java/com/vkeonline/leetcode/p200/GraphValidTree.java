
package com.vkeonline.leetcode.p200;

import java.util.stream.IntStream;

/**
 * Leetcode [M]: 261. Graph Valid Tree
 * @author xiaojun.yang
 */
public class GraphValidTree {
    public boolean validTree(int n, int[][] edges) {
        int[] parent = IntStream.range(0,n).toArray() ;

        for(var edge: edges) {
            if(find(parent, edge[0]) == find(parent, edge[1])) {
                return false ;
            }
            else {
                union(edge[0], edge[1], parent);
            }
        }

        int c = 0 ;

        for (int i = 0; i < n; i++) {
            if(parent[i] == i) {
                c++ ;
            }
        }

        return c == 1 ;
    }

    private void union(int x, int y, int[] parent) {
        int px = find(parent, x) ;
        int py = find(parent, y) ;
        if(px != py) {
            parent[px] = py ;
        }
    }

    private int find(int[] parent, int x) {
        if(parent[x] != x) {
            parent[x] = find(parent, parent[x]) ;
        }
        return parent[x] ;
    }
}
