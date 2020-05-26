package com.vkeonline.lintcode;

import java.util.LinkedHashMap;

/**
 * LintCode: 134. LRU Cache
 */
public class LRUCache {
    private final int capacity;
    private final LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>();
    }

    public int get(int key) {
        int result = -1;

        if(this.cache.containsKey(key)){
            result = this.cache.get(key);
            this.cache.remove(key);
            this.cache.put(key, result);
        }

        return result;
    }

    public void set(int key, int value) {
        if(this.cache.containsKey(key)){
            this.cache.remove(key);
        }else{
            if(this.cache.size() == capacity){
                Integer firstKey = this.cache.keySet().iterator().next();
                this.cache.remove(firstKey);
            }
        }

        this.cache.put(key, value);
    }
}
