package com.vkeonline.leetcode.p500;

/**
 * Leetcode: [M] 547. Number of Provinces
 * @author csgear
 */
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length ;
        int[] parents = new int[n] ;

        for (int i = 0; i < n; i++) {
            parents[i] = i ;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1 ; j < n; j++) {
                if(isConnected[i][j] == 1) {
                    union(parents, i, j);
                }
            }
        }

        int provinces = 0;

        for (int i = 0; i < n; i++) {
            if (parents[i] == i) {
                provinces++;
            }
        }
        return provinces;
    }

    private void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }

    private int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }
}
