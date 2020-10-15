package com.vkeonline.lintcode.p1800;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Lintcode: 1872. Minimum Cost to Connect Sticks
 * * @author  csgear
 */
public class MinimumCostConnectSticks {
    public int MinimumCost(List<Integer> sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
        if(sticks.size() < 2) {
            return 0 ;
        }

        for(int stick: sticks) {
            pq.add(stick) ;
        }

        int result = 0 ;
        while(pq.size() > 1) {
            int cost = pq.poll() + pq.poll() ;
            result += cost ;
            pq.offer(cost) ;
        }

        return result ;
    }
}
