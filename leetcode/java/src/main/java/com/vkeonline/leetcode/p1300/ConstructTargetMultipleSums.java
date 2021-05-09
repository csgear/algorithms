package com.vkeonline.leetcode.p1300;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Leetcode [h]: 1354. Construct Target Array With Multiple Sums
 * @author csgear
 */
public class ConstructTargetMultipleSums {
    public boolean isPossible(int[] target) {
        if(target.length == 1) {
            return target[0] == 1 ;
        }
        int totalSum = Arrays.stream(target).sum() ;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()) ;

        for(int num: target) {
            queue.add(num) ;
        }

        while(queue.element() > 1) {
            int largest = queue.remove() ;
            int rest =  totalSum - largest ;

            if( rest == 1) {
                return true ;
            }
            int x = largest % rest ;

            if (x == 0 || x == largest) {
                return false;
            }

            queue.add(x) ;
            totalSum = totalSum - largest + x ;
        }

        return true ;
    }
}
