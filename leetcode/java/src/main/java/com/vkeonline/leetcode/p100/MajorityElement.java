package com.vkeonline.leetcode.p100;

/**
 * Leetcode [E]: 169. Majority Element
 * @author csgear
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        return findCandidate(nums);
    }

    boolean isMajority(int[] nums) {
        int candidate = findCandidate((nums));
        int i, count = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == candidate)
            {
                count++;
            }
        }
        return count > nums.length / 2;
    }

    private int findCandidate(int[] nums) {
        int majorIndex = 0, count = 1;
        int i;
        for (i = 1; i < nums.length; i++) {
            if (nums[majorIndex] == nums[i]) {
                count++;
            }
            else {
                count--;
            }
            if (count == 0) {
                majorIndex = i;
                count = 1;
            }
        }
        return nums[majorIndex];
    }
}
