package com.vkeonline.leetcode.p900;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Leetcode [M]: 981. Time Based Key-Value Store
 * @author csgear
 */
public class TimeMap {

    private Map<String, TreeMap<Integer, String>> map;

    /**
     * Initialize your data structure here.
     */
    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> treeMap = map.computeIfAbsent(key, k -> new TreeMap<>());

        treeMap.put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> treeMap = map.get(key);

        if (null == treeMap) {
            return "";
        }

        Integer floorKey = treeMap.floorKey(timestamp);
        if (null == floorKey) {
            return "";
        }
        return treeMap.get(floorKey);
    }
}


/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
