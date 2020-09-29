package com.vkeonline.lintcode.p1200;

/**
 * LintCode: 1212. Max Consecutive Ones
 * @author csgear
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0 ;
        }

        int count = 0, result = 0 ;

        for(int i = 0 ; i < nums.length ; i++) {
            if(nums[i] == 1)  {
                count++ ;
                result = Math.max(count, result) ;
            }
            else {
                count = 0 ;
            }
        }

        return result ;
    }
}
