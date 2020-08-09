package com.vkeonline.leetcode.april;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int stone: stones) queue.add(stone) ;
        while(queue.size() > 1) {
            int one = queue.poll() ;
            int two = queue.poll() ;
            if(one != two) queue.offer(Math.abs(one - two)) ;
        }

        return queue.isEmpty() ? 0 : queue.poll() ;
    }
}
