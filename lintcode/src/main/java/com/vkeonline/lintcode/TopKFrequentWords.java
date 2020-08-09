package com.vkeonline.lintcode;

import java.util.*;

/**
 * Lintcode 471. Top K Frequent Words
 */
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> count = new HashMap();
        for (String word: words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> heap = new PriorityQueue<String>(
                (w1, w2) -> count.get(w1).equals(count.get(w2)) ?
                        w2.compareTo(w1) : count.get(w1) - count.get(w2) );

        // heap size of k
        for (String word: count.keySet()) {
            heap.offer(word);
            if (heap.size() > k) heap.poll();
        }

        List<String> ans = new ArrayList();
        while (!heap.isEmpty()) ans.add(heap.poll());
        Collections.reverse(ans);
        return ans;
    }

    public String[] topKFrequentWords(String[] words, int k) {
        List<String> result = new ArrayList<>();

        Map<String, Integer> map = new HashMap<>();

        PriorityQueue<String> heap = new PriorityQueue<>(
                (o1, o2) -> {
                    if (map.get(o1).equals(map.get(o2))) return o1.compareTo(o2);
                    else return map.get(o2) - map.get(o1);
                }
        );

//        List<String> candidates = new ArrayList(map.keySet());
//        Collections.sort(candidates, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
//                w1.compareTo(w2) : map.get(w2) - map.get(w1));
//
//        return candidates.subList(0, k);

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        // heap size of N
        for (String word : map.keySet()) {
            heap.offer(word);
        }

        for (int i = 0; i < k; i++) {
            result.add(heap.poll()) ;
        }

        return result.stream().toArray(String[]::new) ;
    }
}
