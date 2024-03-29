package com.vkeonline.leetcode.p600;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 677. Map Sum Pairs
 * @author csgear
 */
public class MapSum {
    class Node {
        int val;
        Node[] children;

        Node(int val) {
            this.val = val;
            children = new Node[26];
        }
    }

    Node root;
    Map<String, Integer> map;

    /**
     * Initialize your data structure here.
     */
    public MapSum() {
        root = new Node(0);
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        Node root = this.root;
        int diff = val;

        if (map.containsKey(key))
            diff = val - map.get(key);

        map.put(key, val);

        for (char c : key.toCharArray()) {
            if (root.children[c - 'a'] != null) {
                root.children[c - 'a'].val += diff;
            } else {
                root.children[c - 'a'] = new Node(diff);
            }
            root = root.children[c - 'a'];
        }
    }

    public int sum(String prefix) {
        Node root = this.root;
        for (char c : prefix.toCharArray()) {
            if (root.children[c - 'a'] != null) {
                root = root.children[c - 'a'];
            } else {
                return 0;
            }
        }
        return root.val;
    }
}

