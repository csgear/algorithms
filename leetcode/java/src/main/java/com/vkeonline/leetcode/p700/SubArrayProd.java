package com.vkeonline.leetcode.p700;

/**
 * Leetcode [M]: 713. Subarray Product Less Than K
 * @author csgear
 */
public class SubArrayProd {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (k <= 1) {
            return 0;
        }
        int left = 0, result = 0;
        int current = 1;
        for (int i = 0; i < nums.length; i++) {
            current *= nums[i];

            while (current >= k) {
                current = current / nums[left++] ;
            }

            // the # of subarray end with element i
            result += i - left + 1;
        }

        return result;
    }
}
