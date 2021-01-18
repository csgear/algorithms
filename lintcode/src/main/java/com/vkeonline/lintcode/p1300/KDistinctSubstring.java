package com.vkeonline.lintcode.p1300;

/**
 * Lint code: 1375. Substring With At Least K Distinct Characters
 *
 * @author csgear
 */
public class KDistinctSubstring {
    /**
     * @param s: a string
     * @param k: an integer
     * @return: the number of substrings there are that contain at least k distinct characters
     */
    public long kDistinctCharacters(String s, int k) {

        int[] cnt = new int[26];
        int count = 0;
        int l = 0, r = 0;
        long ans = 0;
        int len = s.length();
        while (l <= r && l < len) {
            while (count < k && r < len) {
                cnt[s.charAt(r) - 'a']++;
                if (cnt[s.charAt(r) - 'a'] == 1) {
                    count++;
                }
                r++;
            }
            if (count == k) {
                ans += len - r + 1;
            }
            if (cnt[s.charAt(l) - 'a'] == 1) {
                count--;
            }
            cnt[s.charAt(l) - 'a']--;
            l++;
        }
        return ans;
    }
}
