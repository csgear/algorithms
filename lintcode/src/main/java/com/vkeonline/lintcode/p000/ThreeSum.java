package com.vkeonline.lintcode.p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * LintCode 57. 3Sum
 * @author csgear
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            twoSum(nums, res, i);
        }
        return res;
    }

    private void twoSum(int[] nums, List<List<Integer>> res, int i) {
        int low = i + 1;
        int high = nums.length - 1;
        while(low < high) {
            int sum = nums[i] + nums[low] + nums[high];
            if(sum > 0 || (high < nums.length - 1 && nums[high] == nums[high + 1])) high--;
            else if(sum < 0 || (low > i + 1 && nums[low] == nums[low - 1])) low++;
            else res.add(Arrays.asList(nums[i], nums[low++], nums[high--]));
        }
    }
}
