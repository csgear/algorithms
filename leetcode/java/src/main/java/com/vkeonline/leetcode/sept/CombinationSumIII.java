package com.vkeonline.leetcode.sept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author csgear
 */
public class CombinationSumIII {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        sumHelper(new HashSet<>(), 1, k, n);
        return result;
    }

    public void sumHelper(HashSet<Integer> sum, int lastMax, int k, int n) {
        if (sum.size() == k && n == 0) {
            result.add(new ArrayList<>(sum));
            return;
        }
        for (int i = lastMax; i < 10; i++) {
            sum.add(i);
            sumHelper(sum, i + 1, k, n - i);
            sum.remove(i);
        }
    }
}
