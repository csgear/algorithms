package com.vkeonline.leetcode.p500;

import com.vkeonline.leetcode.UnionFindSet;

import java.util.HashSet;
import java.util.Set;

public class _547 {

    class Solution {
        public int findCircleNum(int[][] M) {
            if (M.length == 0) return 0;
            int n = M.length;
            UnionFindSet s = new UnionFindSet(n);

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (M[i][j] > 0) {
                        s.union(i, j);
                    }
                }
            }

            Set<Integer> circles = new HashSet<>();

            for (int i = 0; i < n; i++)
                circles.add(s.find(i));

            return circles.size();
        }
    }
}
