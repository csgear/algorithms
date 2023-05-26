package com.vkeonline.leetcode.p100;

import java.util.LinkedHashMap;

/**
 * Leetcode [M]: 146. LRU Cache
 * @author
 */
public class LRUCache {
    private LinkedHashMap<Integer, Integer> cache;
    private int N;

    public LRUCache(int capacity) {
        this.N = capacity;
        this.cache = new LinkedHashMap<>();
    }

    public int get(int key) {
        int result = -1;

        if (this.cache.containsKey(key)) {
            result = this.cache.get(key);
            this.cache.remove(key);
            this.cache.put(key, result);
        }

        return result;
    }

    public void put(int key, int value) {
        if (this.cache.containsKey(key)) {
            this.cache.remove(key);
        } else {
            if (this.cache.size() == N) {
                Integer firstKey = this.cache.keySet().iterator().next();
                this.cache.remove(firstKey);
            }
        }

        this.cache.put(key, value);
    }
}
