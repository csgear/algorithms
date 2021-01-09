package com.vkeonline.leetcode.year2020.sept;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author csgear
 */
public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789" ;
        List<Integer> result = new ArrayList<>() ;
        for(int i = 2 ; i < 10 ; i++) {
            for(int j = 0 ; i + j < 10 ; ++j) {
                int t = Integer.parseInt(s.substring(j, i + j)) ;
                if(t >= low) {
                    if(t <= high) {
                        result.add(t) ;
                    }
                    else {
                        return  result ;
                    }
                }
            }
        }

        return  result ;
    }
}
