package com.vkeonline.leetcode;

/**
 * @author csgear
 * leetcode: 8. String to Integer (atoi)
 */
public class StringToInteger {
    public int myAtoi(String str) {
        int pos = 0;
        int sign = 1;
        long result = 0;

        if (str == null || str.length() == 0) {
            return 0;
        }

        while ((pos < str.length()) && (str.charAt(pos) == ' ')) {
            pos += 1;
        }

        if (pos < str.length() && (str.charAt(pos) == '+' || str.charAt(pos) == '-')) {
            sign = str.charAt(pos) == '-' ? -1 : 1;
            pos++;
        }

        while (pos < str.length() && str.charAt(pos) >= '0' && str.charAt(pos) <= '9') {
            result = result * 10 + str.charAt(pos) - '0';

            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            pos++;
        }

        return (int) result * sign;
    }
}

