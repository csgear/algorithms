
package com.vkeonline.leetcode.p000;

/**
 * Leetcode [M]: 91. Decode Ways
 * @author csgear
 */

public class DecodeWays {
    public int numDecodings(String s) {
        int[] dp = new int[s.length() + 1] ;
        dp[0] = 0 ;
        dp[1] = s.charAt(0) == '0' ? 0 : 1 ;

        for (int i = 2; i < s.length(); i++) {
            if(s.charAt(i-1) != '0') {
                dp[i] = dp[i-1] ;
            }

            int twoDigit = Integer.parseInt(s.substring(i - 2, i));
            if (twoDigit >= 10 && twoDigit <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[s.length()] ;
    }

}
