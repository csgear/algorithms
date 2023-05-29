

package com.vkeonline.leetcode.p1000;

/**
 * Leetcode [E]: 1056. Confusing Number
 * @author csgear
 */
public class ConfusingNumber {
    public boolean confusingNumber(int n) {
        int[] map = {0,1,-1,-1,-1,-1,9,-1,8,6} ;
        int m = 0, num = n ;
        while(n > 0) {
            int d = n % 10 ;
            if(map[d] == -1) {
                return false ;
            }
            m = m * 10 + map[d] ;
            n = n / 10 ;
        }
        return m != num ;
    }
}
