

package com.vkeonline.leetcode.p200;

/**
 * Leetcode [M]: 260. Single Number III
 * @author csgear
 */
public class SingleNumber3 {
    public int[] singleNumber(int[] nums) {
        int a = 0, b = 0;
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int lastBit = xor & (-xor);
        for (int num : nums) {
            if ((lastBit & num) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{ a, b };
    }
}
