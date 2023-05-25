package com.vkeonline.leetcode.p600;

import java.util.*;

/**
 * Leetcode [M]: 692. Top K Frequent Words
 * @author csgear
 */
public class TopKFrequentWords {

    class Entry {
        String word;
        int count;

        Entry(String word, int count) {
            this.word = word;
            this.count = count;
        }

        String getWord() {
            return word;
        }

        int getCount() {
            return count;
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        List<String> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        PriorityQueue<Entry> queue = new PriorityQueue<>(
                Comparator.comparingInt(Entry::getCount)
                          .reversed()
                          .thenComparing(Entry::getWord)
        );

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Entry entry1 = new Entry(entry.getKey(), entry.getValue());
            if (queue.size() == k)
                queue.poll();
            queue.offer(entry1);
        }

        int count = Math.min(queue.size(), k) ;
        for (int i = 0; i < count; i++) {
            result.add(queue.poll().getWord());
        }
        return result;
    }

}


