

package com.vkeonline.leetcode.p000;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * LCP [E]: 33. 蓄水
 * @author csgear
 */
public class StoreWater {
    public int storeWater(int[] bucket, int[] vat) {
        int n = bucket.length ;
        int maxk = Arrays.stream(vat).max().getAsInt() ;
        if(maxk == 0) {
            return 0 ;
        }

        int res = Integer.MAX_VALUE ;
        for (int k = 1; k <= maxk && k < res; ++k) {
            int t = 0;
            for (int i = 0; i < n; i++) {
                t += Math.max(0, (vat[i] + k - 1) / k - bucket[i]);
            }
            res = Math.min(res, t + k) ;
        }

        return res ;
    }
}
