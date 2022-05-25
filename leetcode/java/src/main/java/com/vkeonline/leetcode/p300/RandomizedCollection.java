package com.vkeonline.leetcode.p300;

import java.util.*;

/**
 * Leetcode [H]: 381. Insert Delete GetRandom O(1) - Duplicates allowed
 *
 * @author csgear
 */
public class RandomizedCollection {
    private final ArrayList<Integer> list;
    private final HashMap<Integer, HashSet<Integer>> map;
    private final Random random = new Random();

    public RandomizedCollection() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }

    public boolean insert(int val) {
        if (!map.containsKey(val)) {
            map.put(val, new LinkedHashSet<>());
        }
        map.get(val).add(list.size());
        list.add(val);
        return map.get(val).size() == 1;
    }

    public boolean remove(int val) {
        if (map.containsKey(val) || map.get(val).size() == 0) {
            return false;
        }

        int toBeRemoved = map.get(val).iterator().next();
        // remove the toBeRemoved from the set
        map.get(val).remove(toBeRemoved);
        int last = list.get(list.size() - 1);
        list.set(toBeRemoved, last);
        // update the last element index in the set
        map.get(last).add(toBeRemoved);
        map.get(last).remove(list.size() - 1);
        list.remove(list.size() - 1);
        return true;
    }

    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}
