package com.vkeonline.leetcode.p000;

/**
 * Leetcode [E]: 66. Plus One
 * @author csgear
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length, carry = 1;

        while (--len >= 0 && carry != 0) {
            carry = digits[len] + 1 >= 10 ? 1 : 0;
            digits[len] = (digits[len] + 1) % 10;
        }

        int[] ans = new int[digits.length + 1];

        // if carry happens at the very first digits, set the first to be 1, like 999
        if (carry == 1) {
            ans[0] = 1;
        }

        return carry == 1 ? ans : digits;
    }
}
