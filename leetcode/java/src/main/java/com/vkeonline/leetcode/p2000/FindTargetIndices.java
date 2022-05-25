
package com.vkeonline.leetcode.p2000;

import java.util.ArrayList;
import java.util.List;


/**
 * Leetcode [E]: 2089. Find Target Indices After Sorting Array
 * @author csgear
 */
public class FindTargetIndices {
    public List<Integer> targetIndices(int[] nums, int target) {
        int lessCount = 0 ;
        for(int num: nums) {
            if(num < target) {
                lessCount++ ;
            }
        }
        List<Integer> result = new ArrayList<>() ;
        for(int num: nums) {
            if(num == target) {
                result.add(lessCount++) ;
            }
        }

        return  result ;
    }

}
