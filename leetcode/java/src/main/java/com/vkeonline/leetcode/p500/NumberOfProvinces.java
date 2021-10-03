package com.vkeonline.leetcode.p500;

import com.vkeonline.leetcode.UnionFindSet;
import java.util.HashSet;
import java.util.Set;


/**
 * Leetcode: [M] 547. Number of Provinces
 * @author csgear
 */
public class NumberOfProvinces {
    public int findCircleNum(int[][] M) {
        if (M.length == 0) {
            return 0;
        }
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

        for (int i = 0; i < n; i++) {
            circles.add(s.find(i));
        }

        return circles.size();
    }

}
