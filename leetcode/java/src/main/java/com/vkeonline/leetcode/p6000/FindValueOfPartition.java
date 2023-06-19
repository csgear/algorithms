

package com.vkeonline.leetcode.p6000;

import java.util.Arrays;

/**
 * Leetcode [M]: 6890. 找出分区值
 * @author csgear
 */
public class FindValueOfPartition {
    public int findValueOfPartition(int[] nums) {
        int ans = Integer.MAX_VALUE ;
        Arrays.sort(nums) ;
        for (int i = 0; i < nums.length - 1; i++) {
            ans = Math.min(ans, nums[i+1] - nums[i]) ;
        }

        return ans ;
    }
}
