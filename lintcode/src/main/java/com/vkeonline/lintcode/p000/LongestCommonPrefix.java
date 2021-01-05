package com.vkeonline.lintcode.p000;

/**
 * Lint code: 78 Longest Common Prefix
 *
 * @author csgear
 */
public class LongestCommonPrefix {
    /**
     * @param strs: A list of strings
     * @return The longest common prefix
     * Description: using simple simulation from the first string to last string
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String commonPrefix = strs[0];

        for (String s : strs) {
            int index = 0;
            while (index < Math.min(commonPrefix.length(), s.length()) &&
                    s.charAt(index) == commonPrefix.charAt(index)) {
                index++;
            }
            commonPrefix = commonPrefix.substring(0, index) ;
        }

        return commonPrefix ;
    }
}
