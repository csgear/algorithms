package com.vkeonline.leetcode.year2021.jan;

import java.util.Arrays;

/**
 * Minimum Operations to Reduce X to Zero
 *
 * @author csgear
 */
public class MinOpsReduceToZero {
    public int minOperations(int[] nums, int x) {
        int target = Arrays.stream(nums).sum() - x;

        if (target < 0) {
            return -1;
        }

        int left = 0, right = 0, curr = 0, ans = -1;
        for (; right < nums.length; right++) {
            curr += nums[right];
            while (curr > target && left <= right) {
                curr -= nums[left];
                left++;
            }
            if (curr == target) {
                ans = Math.max(ans, right - left + 1);
            }
        }

        return ans == -1 ? ans : nums.length - ans;

    }
}
