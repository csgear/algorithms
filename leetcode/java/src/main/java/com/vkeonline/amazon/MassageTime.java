

package com.vkeonline.amazon;

/**
 * Leetcode [E]: 面试题 17.16. 按摩师
 * @author csgear
 */
public class MassageTime {
    public int massage(int[] nums) {
        if(nums.length == 0) {
            return 0 ;
        }

        if(nums.length == 1) {
            return nums[0] ;
        }
        int dp0 = nums[0] ;
        int dp1 = Math.max(nums[0], nums[1]) ;
        int dp2 = dp1 ;
        for (int i = 2; i < nums.length; i++) {
            dp2 = Math.max(nums[i] + dp0, dp1) ;
            dp0 = dp1 ;
            dp1 = dp2 ;
        }
        return dp2 ;
    }
}
