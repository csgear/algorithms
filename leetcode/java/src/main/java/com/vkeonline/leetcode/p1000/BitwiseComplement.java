
package com.vkeonline.leetcode.p1000;

/**
 * Leetcode [E]: 1009. Complement of Base 10 Integer
 * @author csgear
 */
public class BitwiseComplement {
    public int bitwiseComplement(int num) {
        if(num == 0) {
            return 1 ;
        }
        int result = 0 ;
        int set = 1 ;
        while(num > 0) {
            if((num & 1) == 0) {
                result |= set ;
            }
            set <<= 1 ;
            num >>= 1 ;
        }

        return result ;
    }
}
