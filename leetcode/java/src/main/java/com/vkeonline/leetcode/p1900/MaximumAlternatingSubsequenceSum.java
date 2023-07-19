
package com.vkeonline.leetcode.p1900;

/**
 * Leetcode [M]: 1911. Maximum Alternating Subsequence Sum
 * @author csgear
 */
public class MaximumAlternatingSubsequenceSum {
    public long maxAlternatingSum(int[] nums) {
        long even = 0;
        long odd = nums[0];
        long res = nums[0];
        for(int i = 1; i < nums.length; i++){
            long prevEven = even;
            long prevOdd = odd;
            even = Math.max(prevEven, prevOdd - nums[i]);
            odd = Math.max(prevOdd, prevEven + nums[i]);
            res = Math.max(res, Math.max(even, odd));
        }
        return res;
    }
}
