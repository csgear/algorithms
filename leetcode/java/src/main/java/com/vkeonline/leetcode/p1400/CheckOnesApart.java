package com.vkeonline.leetcode.p1400;

/**
 * Leetcode [E]: 1437. Check If All 1's Are at Least Length K Places Away
 * @author csgear
 */
public class CheckOnesApart {
    public boolean kLengthApart(int[] nums, int k) {
        int count = k;
        for (int num : nums) {
            if (num == 1) {
                if (count < k) {
                    return false;
                }
                count = 0;
            } else {

                ++count;
            }
        }
        return true;
    }
}
