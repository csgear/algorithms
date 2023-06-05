

package com.vkeonline.leetcode.p1300;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Leetcode [M]: 1376. Time Needed to Inform All Employees
 * @author xiaojun.yang
 */
public class imeNeededInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager,
            int[] informTime) {
        Map<Integer, List<Integer>> g = new HashMap<>();
        for (int i = 0; i < n; i++) {
            g.putIfAbsent(manager[i], new ArrayList<>());
            g.get(manager[i]).add(i);
        }
        return dfs(headID, informTime, g);
    }

    private int dfs(int cur, int[] informTime, Map<Integer, List<Integer>> g) {
        int res = 0;
        for (int neighbor : g.getOrDefault(cur, new ArrayList<>())) {
            res = Math.max(res, dfs(neighbor, informTime, g));
        }
        return informTime[cur] + res;
    }


}
