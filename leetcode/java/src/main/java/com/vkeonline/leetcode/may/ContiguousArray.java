package com.vkeonline.leetcode.may;

import java.util.HashMap;

/**
 * @author csgear
 * Leetcode: 525 Contiguous Array
 */
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int result = 0;
        HashMap<Integer, Integer> prev_mapper = new HashMap<>();
        prev_mapper.put(0, 0);
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                sum += -1;
            } else {
                sum += 1;
            }
            if(prev_mapper.get(sum) == null) {
                prev_mapper.put(sum, i+1);
            }
            else {
                result = Math.max(result, (i+1) - prev_mapper.get(sum));
            }
        }
        return result;
    }
}
