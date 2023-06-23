

package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode [M]: 47. Permutations II
 * @author csgear
 */
public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>() ;
        List<Integer> curr = new ArrayList<>() ;
        boolean[] visited = new boolean[nums.length] ;
        Arrays.sort(nums);
        dfs(nums, 0,  ans, curr, visited) ;
        return ans ;
    }

    private void dfs(int[] nums, int pos,
            List<List<Integer>> ans, List<Integer> current, boolean[] visited) {
        if(pos == nums.length) {
            ans.add(current);
            return ;
        }

        // 我们选择对原数组排序，保证相同的数字都相邻，
        // 然后每次填入的数一定是这个数所在重复数集合中
        // 「从左往右第一个未被填过的数字」
        for (int i = 0; i < nums.length; i++) {
            if (visited[i] || (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])) {
                continue;
            }
            current.add(nums[i]) ;
            visited[i] = true ;
            dfs(nums, pos + 1, ans, current, visited) ;
            visited[i] = false ;
            current.remove(pos) ;
        }
    }

}
