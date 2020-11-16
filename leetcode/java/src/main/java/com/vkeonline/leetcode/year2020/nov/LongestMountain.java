package com.vkeonline.leetcode.year2020.nov;

/**
 * @author csgear
 */
public class LongestMountain {
    public int longestMountain(int[] A) {
        int max = 0, inc = 0, dec = 0;
        for (int i = 1; i < A.length; i++) {
            if(A[i] > A[i-1]) {
                if(dec > 0) {
                    inc = 0 ;
                }
                inc++ ;
                dec = 0 ;
            }
            else if (A[i] < A[i-1]){
                if( inc > 0) {
                    dec++ ;
                    max = Math.max(max, dec + inc + 1) ;
                }
            }
            else {
                inc = 0 ;
                dec = 0 ;
            }
        }
        return max ;
    }
}
