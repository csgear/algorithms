package com.vkeonline.lintcode.p400;

/**
 * Lint code: 407. Plus On
 *
 * @author csgear
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;

        for (int i = digits.length - 1; carry > 0 && i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = carry;
            System.arraycopy(digits, 0, result, 1, result.length - 1);
            return result;
        }
    }
}
