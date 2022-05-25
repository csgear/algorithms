package com.vkeonline.leetcode.p200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Leetcode [3]: Combination Sum III
 *
 * @author csgear
 */
public class CombinationSum3 {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(new HashSet<>(), 1, k, n);
        return result;
    }

    private void helper(HashSet<Integer> sums, int index, int k, int n) {
        if (sums.size() == k && n == 0) {
            result.add(new ArrayList<>(sums));
        }
        for (int i = index; i < 10; i++) {
            sums.add(i);
            helper(sums, i + 1, k, n - i);
            sums.remove(i);
        }
    }
}
