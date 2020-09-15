package com.vkeonline.leetcode.Sept;

/**
 * @author csgear
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int dp1 = 0, dp2 = 0, maxAmount = 0;
        for(int num: nums) {
            maxAmount = Math.max(dp2, num + dp1);
            dp1 = dp2;
            dp2 = maxAmount;
        }
        return maxAmount;
    }
}
