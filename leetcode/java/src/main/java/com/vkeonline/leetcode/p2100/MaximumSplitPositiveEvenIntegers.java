
package com.vkeonline.leetcode.p2100;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 */
public class MaximumSplitPositiveEvenIntegers {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>() ;
        if(finalSum % 2 > 0) {
            return res ;
        }

        for (int i = 2; i <= finalSum ; i += 2) {
            res.add((long)i);
            finalSum -= i ;
        }

        res.set(res.size() - 1, res.get(res.size() - 1) + finalSum) ;

        return res ;
    }
}
