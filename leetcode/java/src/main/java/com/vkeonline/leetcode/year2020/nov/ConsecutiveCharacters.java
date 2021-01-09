package com.vkeonline.leetcode.year2020.nov;

/**
 * @author csgear
 */
public class ConsecutiveCharacters {
    public int maxPower(String s) {
        char prev = ' ';
        int count = 0, ans = 1;
        for(char c : s.toCharArray()){
            if(c != prev)
            {
                count = 0;
            }
            count++;
            ans = Math.max(ans, count);
            prev = c;
        }
        return ans;

    }
}
