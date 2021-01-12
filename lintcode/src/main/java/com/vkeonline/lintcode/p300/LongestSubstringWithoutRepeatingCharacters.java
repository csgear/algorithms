package com.vkeonline.lintcode.p300;

/**
 * Lint code: 384: Longest Substring Without Repeating Characters
 *
 * @author csgear
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[256];
        int result = 0;

        int right = 0;

        for (int left = 0; left < s.length(); left++) {
            while (right < s.length() && count[s.charAt(right)] == 0) {
                count[s.charAt(right)] = 1;
                result = Math.max(result, right - left + 1);
                right++;
            }
            count[s.charAt(left)] = 0;
        }

        return result;
    }

}
