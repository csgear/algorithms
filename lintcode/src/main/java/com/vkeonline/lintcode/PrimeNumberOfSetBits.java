package com.vkeonline.lintcode;

/**
 * LintCode: 046. Prime Number of Set Bits in Binary Representation
 */
public class PrimeNumberOfSetBits {
    public int countPrimeSetBits(int L, int R) {
        int result = 0 ;
        for(int i = L ; i <= R ; i++) {
            int count = 0 ;
            int val = i ;
            while(val != 0) {
                if( (val & 1) == 1)  count++ ;
                val = val >> 1 ;
            }
            if(isPrime(count)) result++ ;
        }

        return result ;
    }

    private boolean isPrime(int count) {
        if(count == 2 || count == 3 || count == 5 || count == 7 || count == 11 || count == 13 || count == 17 || count == 19)
            return true;
        return false;
    }
}
