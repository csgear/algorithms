package com.vkeonline.leetcode.year2020.may;

/**
 * @author csgear
 */
public class CountingBits {
    /**
     * use the previous result  (i & (i-1)) will remove the least significant 1 from i
     * @param num, an integer
     * @return an array which contains #1 for each number less and equal to n
     */
    public int[] countBits(int num) {
        int[] result = new int[num + 1] ;
        for(int i = 1 ; i <= num ; i++) {
            result[i] = result[ (i & (i-1))] + 1 ;
        }
        return result ;
    }
}
