package com.vkeonline.lintcode.p1700;

import java.util.Arrays;

/**
 * Lintcode: 1736. Throw garbage
 * @author csgear
*/
public class ThrowGarbage {
    /**
     * @param BagList: the weight of all garbage bags.
     * @return: an integer represent the minimum number of times.
     */
    public int Count_ThrowTimes(float[] BagList) {
        Arrays.sort(BagList) ;
        int left = 0, right = BagList.length - 1 ;
        int count = 0 ;
        while(left < right) {
            if (BagList[left] + BagList[right] > 3.0) {
                right-- ;
                count++ ;
            }
            else {
                count++ ;
                left++ ;
                right-- ;
            }
        }

        if(left == right) count++ ;

        return count ;
    }
}
