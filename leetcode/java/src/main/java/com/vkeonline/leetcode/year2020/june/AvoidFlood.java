package com.vkeonline.leetcode.year2020.june;

import java.util.HashMap;
import java.util.TreeSet;

/**
 * @author csgear
 */
public class AvoidFlood {
    public int[] avoidFlood(int[] rains) {
        TreeSet<Integer> tree = new TreeSet<>();
        int[] ans = new int[rains.length];
        HashMap<Integer, Integer> lastOccurrence = new HashMap<>();
        for (int i = 0; i < rains.length; ++i) {
            if (rains[i] == 0) {
                // Store location of 0's sorted.
                tree.add(i);
            } else {
                ans[i] = -1;
                // If this is a recurrence of rain day
                if (lastOccurrence.containsKey(rains[i])) {
                    // Find the first occurrence of 0 closest to the right of last occurrence of rains[i]
                    Integer ceiling = tree.ceiling(lastOccurrence.get(rains[i]));
                    if (ceiling != null) {
                        // This rain day is used, remove it from tree.
                        tree.remove(ceiling);
                        ans[ceiling] = rains[i];
                    } else {
                        // We couldn't find a 0 between last occurrence of rains[i] and i
                        return new int[0];
                    }
                }
                lastOccurrence.put(rains[i], i);
            }
        }
        for (Integer emptyPlaces : tree) {
            ans[emptyPlaces] = 1;
        }
        return ans;
    }
}
