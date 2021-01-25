package com.vkeonline.lintcode.p100;

/**
 * Lint code: 183. Wood Cut
 * @author csgear
 */
public class WoodCut {
    public int woodCut(int[] L, int k) {
        int l = 1, r = 0 ;
        for(int item: L) {
            r = Math.max(item, r) ;
        }

        int result = 0 ;

        while(l <= r) {
            int middle = l + (r - l) / 2 ;
            if(countCuts(L, middle) >= k) {
                result = middle ;
                l = middle + 1 ;
            }
            else {
                r = middle - 1 ;
            }
        }

        return result ;
    }

    private int countCuts(int[] L, int len) {
        int sum = 0 ;
        for(int l: L) {
            sum += l / len ;
        }
        return sum ;
    }
}
