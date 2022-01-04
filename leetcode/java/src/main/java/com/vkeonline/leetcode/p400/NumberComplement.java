package com.vkeonline.leetcode.p400;

/**
 * Leetcode [E]: 476. Complement of Base 10 Integer
 * @author csgear
 */
public class NumberComplement {
    public int findComplement(int num) {
        int result = 0 ;
        int set = 1 ;
        while( num > 0) {
            if ((num & 1) == 0) {
                result |= set ;
            }
            set <<= 1 ;
            num >>= 1 ;
        }

        return  result ;
    }
}
