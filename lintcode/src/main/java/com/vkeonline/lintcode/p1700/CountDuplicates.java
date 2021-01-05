package com.vkeonline.lintcode.p1700;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author csgear
 * Lintcode: 1794. Count Duplicates
 */
public class CountDuplicates {
    public List<Integer> CountDuplicates(List<Integer> nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1 ;
            if(count == 2) {
                res.add(num) ;
            }
            map.put(num, count) ;
        }

        return res;
    }
}
