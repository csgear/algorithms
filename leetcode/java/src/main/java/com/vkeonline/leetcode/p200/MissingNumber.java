package com.vkeonline.leetcode.p200;

import java.util.Arrays;

/**
 * Leetcode [E]: 268. Missing Number
 * @author csgear
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum() ;
        int n = nums.length ;
        return n * (n + 1) / 2 - sum ;
    }
}
