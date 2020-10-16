package com.vkeonline.leetcode.p600;

import java.util.*;

public class _692 {
    public static void main(String[] args) {
        String s = "word";
        String quotes = "Put your best words forward\n" +
                "Write with confidence, knowing intelligent technology can help with spelling, " +
                "grammar and even stylistic writing suggestions." +
                " With tools at your fingertips, easily go from pen and paper " +
                "to digital inking and edit intuitively.";

        System.out.println(quotes.contains(s));
    }

    class Solution {
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
                if (queue.size() == k) queue.poll();
                queue.offer(entry1);
            }

            for (int i = 0; i < Math.min(queue.size(), k); i++) {
                result.add(queue.poll().getWord());
            }
            return result;
        }


    }




}
