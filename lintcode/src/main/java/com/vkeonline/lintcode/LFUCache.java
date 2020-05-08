package com.vkeonline.lintcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

/**
 * LintCode: 24. LFU Cache
 */
public class LFUCache {
    private final int capacity ;
    private final Map<Integer, Integer> cache ;
    private final TreeMap<Integer, LinkedList<Integer>> freqMap ;
    /*
     * @param capacity: An integer
     */public LFUCache(int capacity) {
        this.capacity = capacity ;
        this.cache = new HashMap<>() ;
        this.freqMap = new TreeMap<>() ;
    }

    /*
     * @param key: An integer
     * @return: An integer
     */
    public int get(int key) {
        // write your code here
        if(capacity == 0 || cache.size() == 0) return -1 ;

        if(cache.containsKey(key)) {
            increaseFrequency(key);
            return cache.get(key) ;
        }
        else {
            return -1 ;
        }
    }

    public void set(int key, int value) {
        this.put(key, value);
    }

    /*
     * @param key: An integer
     * @param value: An integer
     * @return: nothing
     */
    public void put(int key, int value) {
        if(capacity == 0 || value < 0) return ;

        if(this.get(key) < 0) {
            if(cache.size() < capacity) {
                setFrequency(1, key);
            }
            else {
                Map.Entry<Integer, LinkedList<Integer>> entry = freqMap.firstEntry() ;
                LinkedList<Integer> list = entry.getValue() ;
                cache.remove(list.removeFirst()) ;
                setFrequency(1, key);
                if(list.isEmpty()) {
                    freqMap.remove(entry.getKey()) ;
                }
            }
        }

        cache.put(key, value) ;
    }


    private void increaseFrequency(int key) {
        int frequency = getLastFrequency(key) ;
        setFrequency(frequency + 1, key) ;
    }

    private int getLastFrequency(int key) {
        for(Map.Entry<Integer, LinkedList<Integer>> entry: freqMap.entrySet()) {
            LinkedList<Integer> list = entry.getValue() ;
            if(list.contains((Integer)key)) {
                int frequency = entry.getKey() ;
                remove(key, list, frequency) ;
                return frequency ;
            }
        }
        return 0 ;
    }

    private void remove(int key, LinkedList<Integer> list, int frequency) {
        list.remove( (Integer) key) ;
        if(list.isEmpty()) {
            freqMap.remove(frequency) ;
        }
    }

    private void setFrequency(int frequency, int key) {
        if(! freqMap.containsKey(frequency)) {
            freqMap.put(frequency, new LinkedList<>()) ;
        }

        freqMap.get(frequency).addLast((Integer) key);
    }
}
