

package com.vkeonline.leetcode.p2500;


/**
 * Leetcode [M]: 2560. House Robber IV
 * @author csgear
 */
public class HouseRobber4 {
    public int minCapability(int[] nums, int k) {
        int n = nums.length;
        int max = 0;
        for (int x : nums) max = Math.max(max, x);
        int l = 0, r = max + 1;
        while (l + 1 < r) {
            int c = l + (r - l) / 2;
            if (checkCapacity(nums, k, c)) r = c;
            else l = c;
        }
        return r;
    }

    /**
     * 当窃取的最大金额为c时，返回在nums中窃取不相邻的房屋，能窃取的房屋数dp1是否大于等于k
     * @return boolean
     */
    private boolean checkCapacity(int[] nums, int k, int c) {
        int dp0 = 0 ;
        int dp1 = 0 ;
        for(int num : nums) {
            if(num > c) {
                dp0 = dp1 ;
            }
            else {
                int tmp = dp1 ;
                dp1 = Math.max(dp1, dp0 + 1) ;
                dp0 = tmp ;
            }
            if (dp1 >= k) return true;
        }
        return false ;
    }
}

