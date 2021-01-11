package com.vkeonline.lintcode.p200;

import com.vkeonline.lintcode.common.BITree;

import java.util.ArrayList;
import java.util.List;

/**
 * Lint code: 248. Count of Smaller Number
 * @author csgear
 */
public class CountSmallerNumber {
    /**
     * @param A: An integer array
     * @param queries: The query list
     * @return The number of element in the array that are smaller that the given integer
     */
    public List<Integer> countOfSmallerNumber(int[] A, int[] queries) {
        BITree biTree = new BITree(10000+1) ;

        for (int num : A) {
            biTree.increase(num, 1);
        }

        List<Integer> result = new ArrayList<>() ;

        for(int query: queries) {
            result.add(biTree.query(query - 1)) ;
        }

        return result ;
    }

}
