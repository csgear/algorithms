package com.vkeonline.lintcode.p300;

/**
 * Lint code: 386. Longest Substring with At Most K Distinct Characters
 * @author csgear
 */
public class LongestSubstringK {
    /**
     * @param s: A string
     * @param k: An integer
     * @return An integer
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if(s.length() == 0 || k == 0) {
            return 0 ;
        }

        int left = 0, right = 0, cnt = 0 ;
        int[] count = new int[256] ;
        int ans = Integer.MIN_VALUE ;

        while(right < s.length()) {
            if(count[s.charAt(right)] == 0) {
                cnt++ ;
            }
            count[s.charAt(right)]++ ;
            right++ ;

            while(cnt > k) {
                count[s.charAt(left)]-- ;
                if(count[s.charAt(left)] == 0) {
                    cnt-- ;
                }
                left++ ;
            }

            ans = Math.max(ans, right - left) ;
        }

        return ans ;
    }
}
