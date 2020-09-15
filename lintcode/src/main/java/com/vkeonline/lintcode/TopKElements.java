package com.vkeonline.lintcode;

import java.util.*;

/**
 * Lintcode: 1281. Top K Frequent Elements
 * @author csgear
 */
public class TopKElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>() ;

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1) ;
        }

        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((o1, o2) -> {
            return o1.getValue() - o2.getValue() ;
        }) ;

        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(queue.size() < k) {
                queue.offer(entry) ;
            }
            else if (queue.peek().getValue() < entry.getValue()) {
                queue.poll() ;
                queue.offer(entry) ;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry: queue) {
            result.add(0, entry.getKey()) ;
        }

        return result ;
    }
}
