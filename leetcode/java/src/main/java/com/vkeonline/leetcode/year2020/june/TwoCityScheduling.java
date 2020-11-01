package com.vkeonline.leetcode.year2020.june;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author csgear
 * LeetCode: Two City Scheduling
 */
public class TwoCityScheduling {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, Comparator.comparingInt(o -> (o[0] - o[1])));
        int res = 0, i = 0, j = costs.length - 1;
        while (i < j) {
            res += costs[i][0];
            res += costs[j][1];
            i++;
            j--;
        }
        return res;
    }
}
