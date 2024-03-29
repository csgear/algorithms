package com.vkeonline.leetcode.p100;

import java.util.HashSet;
import java.util.Set;

/**
 * Leetcode [E]: 136. Single Number
 * @author csgear
 */
public class SingleNumber {
    public int singleNumber_withSet(int[] nums) {
        Set<Integer> set = new HashSet<>() ;
        for(int num : nums) {
            if(set.contains(num)) {
                set.remove(num) ;
            }
            else {
                set.add(num) ;
            }
        }

        return set.iterator().next() ;
    }

    public int singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;

    }


}
