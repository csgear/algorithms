package com.vkeonline.leetcode.p400;

/**
 * Leetcode [M]: 487. Max Consecutive Ones II
 * @author csgear
 */
public class MaxConsecutiveOnesII {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxWithFlip = 0;
        int maxWithoutFlip = 0;
        int maxSoFar = 0;
        for (int num : nums) {
            if (num == 0) {
                maxWithFlip = maxWithoutFlip + 1;
                maxWithoutFlip = 0;
            } else {
                maxWithFlip += 1;
                maxWithoutFlip += 1;
            }
            maxSoFar = Math.max(maxSoFar, Math.max(maxWithFlip, maxWithoutFlip));
        }
        return maxSoFar;
    }
}
