package com.vkeonline.leetcode.p600;

import com.vkeonline.leetcode.UnionFindSet;

/**
 * Leetcode [M]: 684: Redundant Connection
 * @author csgear
 */
public class RedundantConnection {
    public int[] findRedundantConnection(int[][] edges) {
        if (edges.length == 0)
            return new int[]{};

        int n = edges.length + 1;

        UnionFindSet s = new UnionFindSet(n);

        for (int[] edge : edges) {
            if (!s.union(edge[0], edge[1])) {
                return new int[]{ edge[0], edge[1] };
            }
        }

        return new int[]{};
    }
}
