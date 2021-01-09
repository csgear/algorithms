package com.vkeonline.leetcode.year2020.june;

/**
 * @author csgear
 */
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int result = 0;
        int[] bits = new int[32];

        for (int i = 0; i < 32; i++) {
            for (int num : nums) {
                bits[i] += num >> i & 1;
            }
            bits[i] %= 3;

            result |= bits[i] << i;
        }

        return result;
    }
}
