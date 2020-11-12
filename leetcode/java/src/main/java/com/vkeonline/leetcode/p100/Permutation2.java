package com.vkeonline.leetcode.p100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. Permutations II
 * @author csgear
 */
public class Permutation2 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        dfs(nums,new boolean[nums.length],new ArrayList());
        return result;
    }

    void dfs(int[] nums, boolean[] visited, List<Integer> currentResult) {
        if(currentResult.size() == visited.length) {
            result.add(new ArrayList<>(currentResult)) ;
        }
        else {
            for (int i = 0; i < nums.length; i++) {
                if(visited[i] || (i > 0 && visited[i-1] && nums[i] == nums[i-1])) {
                    continue;
                }

                visited[i] = true ;
                currentResult.add(nums[i]) ;
                dfs(nums, visited, currentResult) ;
                currentResult.remove(currentResult.size() - 1) ;
                visited[i] = false ;
            }
        }
    }
}
