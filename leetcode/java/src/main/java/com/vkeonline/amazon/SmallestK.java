
package com.vkeonline.amazon;

import java.util.PriorityQueue;

/**
 * Leetcode [M]: 面试题 17.14. 最小K个数
 * @author csgear
 */
public class SmallestK {
    /* sort, priority queue or quick sort (random algorithm) */
    public int[] smallestSpaceN(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>() ;
        for(int num: arr) {
            queue.add(num) ;
        }

        int[] result = new int[k] ;
        for (int i = 0; i < k; i++) {
            result[i] = queue.remove() ;
        }
        return result ;
    }

    public int[] smallestSpaceK(int[] arr, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (x,y) -> y -x);

        for (int i = 0; i < k; i++) {
            queue.offer(arr[i]) ;
        }

        for (int i = k; i < arr.length; i++) {
            if(queue.peek() > arr[i]) {
                queue.poll() ;
                queue.offer(arr[i]) ;
            }
        }

        int[] result = new int[k] ;

        for (int i = 0; i < k; i++) {
            result[i] = queue.poll() ;
        }
        return result ;
    }
}
