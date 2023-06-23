package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode [M]: 39. Combination Sum
 * @author csgear
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        candidates = Arrays.stream(candidates).sorted().distinct().toArray() ;
        List<List<Integer>> results = new ArrayList<>();
        dfs(candidates, 0, target, new ArrayList<>(), results);
        return results;
    }

    private void dfs(int[] candidates, int index, int target, List<Integer> combination, List<List<Integer>> results) {
        if (index == candidates.length) {
            if (target == 0) {
                results.add(new ArrayList<>(combination));
            }
            return;
        }

        if (target < 0) {
            return;
        }

        dfs(candidates, index + 1, target, combination, results);

        combination.add(candidates[index]);
        dfs(candidates, index, target - candidates[index], combination, results);
        combination.remove(combination.size() - 1);
    }
}
