package com.vkeonline.lintcode.p1200;

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

        PriorityQueue<Map.Entry<Integer, Integer>> queue =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue)) ;

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
