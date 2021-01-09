package com.vkeonline.leetcode.year2020.june;

/**
 * @author csgear
 * Leetcode: 260. Single Number III
 */
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for (int value : nums) {
            xor ^= value;
        }

        int lastBit = xor - (xor & (xor - 1));

        int group0 = 0, group1 = 0;
        for (int num : nums) {
            if ((lastBit & num) == 0) {
                group0 ^= num;
            } else {
                group1 ^= num;
            }
        }

        int[] result = new int[2] ;
        result[0] = group0;
        result[1] = group1;
        return result;
    }
}
