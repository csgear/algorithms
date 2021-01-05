package com.vkeonline.lintcode.p500;

/**
 * 564. Combination Sum IV
 * @author csgear
 * Backpack: items can be picked up more than once
 */
public class CombinationSum4 {
    /**
     * @param nums: an integer array and all positive numbers, no duplicates
     * @param target: An integer
     * @return An integer
     */
    public int backPackVI(int[] nums, int target) {
        // comb[target] = sum(comb[target - nums[i]]), where 0 <= i < nums.length, and target >= nums[i]
        int[] f = new int[target+1] ;
        f[0] = 1 ;
        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i >= num) {
                    f[i] += f[i - num];
                }
            }
        }

        return f[target] ;
    }
}
