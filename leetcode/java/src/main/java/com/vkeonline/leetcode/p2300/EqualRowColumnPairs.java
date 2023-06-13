

package com.vkeonline.leetcode.p2300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leetcode [M]: 2352. Equal Row and Column Pairs
 * @author csgear
 */
public class EqualRowColumnPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<List<Integer>, Integer> cnt = new HashMap<>();
        for (int[] row : grid) {
            List<Integer> arr = new ArrayList<>();
            for (int num : row) {
                arr.add(num);
            }
            cnt.put(arr, cnt.getOrDefault(arr, 0) + 1);
        }

        int res = 0;
        for (int j = 0; j < n; j++) {
            List<Integer> arr = new ArrayList<>();
            for (int[] col : grid) {
                arr.add(col[j]);
            }
            if (cnt.containsKey(arr)) {
                res += cnt.get(arr);
            }
        }
        return res;
    }
}
