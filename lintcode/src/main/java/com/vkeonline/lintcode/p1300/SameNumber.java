package com.vkeonline.lintcode.p1300;

import java.util.HashMap;
import java.util.Map;

/**
 * @author csgear
 * Lint code: 1368. Same Number
 */
public class SameNumber {
    public String sameNumber(int[] nums, int k) {
        String result = "NO" ;

        if(nums == null || nums.length == 0) {
            return result ;
        }

        Map<Integer, Integer> map = new HashMap<>() ;

        for(int i = 0 ; i < nums.length ; i++) {
            if(map.containsKey(nums[i])) {
                if(i - map.get(nums[i]) < k) {
                    result = "YES" ;
                    break ;
                }
            }

            map.put(nums[i], i) ;
        }

        return result ;
    }
}
