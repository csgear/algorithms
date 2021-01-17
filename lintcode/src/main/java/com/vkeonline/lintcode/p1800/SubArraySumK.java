package com.vkeonline.lintcode.p1800;

import java.util.HashMap;
import java.util.Map;

/**
 * lint code: 1844. subarray sum equals to k II
 * @author csgear
 */
public class SubArraySumK {
    /**
     * @param nums: a list of integer
     * @param k: an integer
     * @return return an integer, denote the minimum length of continuous subarrays whose sum equals to k
     */
    public int subarraySumEqualsKII(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>() ;
        map.put(0, -1) ;
        int result = Integer.MAX_VALUE ;
        int preSum = 0 ;
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i] ;
            if(map.containsKey(preSum - k)) {
                result = Math.min(result, i - map.get(preSum - k)) ;
            }
            map.put(preSum, i) ;
        }
        
        return result == Integer.MAX_VALUE ? -1 : result ;

    }
}
