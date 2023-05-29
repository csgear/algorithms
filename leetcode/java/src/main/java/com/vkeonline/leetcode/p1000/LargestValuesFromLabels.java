
package com.vkeonline.leetcode.p1000;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode[M]: 1090. Largest Values From Labels
 * @author csgear
 */
public class LargestValuesFromLabels {
    public int largestValsFromLabels(int[] values, int[] labels, int numWanted,
            int useLimit) {
        int n = values.length ;
        Integer[] ids = new Integer[n] ;
        for (int i = 0; i < n ; i++) {
            ids[i] = i ;
        }

        Arrays.sort(ids, (a, b) -> values[b] - values[a]) ;

        Map<Integer, Integer> cnt = new HashMap<>() ;

        int res = 0 ;
        int numOfChosen = 0 ;

        for (int i = 0; i < n && numOfChosen < numWanted; i++) {
            int label = labels[ids[i]] ;
            if(cnt.getOrDefault(label, 0) == useLimit) {
                continue;
            }
            res += values[ids[i]] ;
            numOfChosen++ ;
            cnt.put(label, cnt.getOrDefault(label, 0) + 1);
        }

        return res ;

    }
}
