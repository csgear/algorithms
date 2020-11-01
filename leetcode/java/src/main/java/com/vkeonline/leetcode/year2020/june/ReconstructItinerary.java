package com.vkeonline.leetcode.year2020.june;

import java.util.*;

/**
 * @author csger
 */
public class ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> dests = new HashMap<>();

        for (List<String> t : tickets) {
            dests.computeIfAbsent(t.get(0), k -> new PriorityQueue<>()).add(t.get(1));
        }
        List<String> res = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.empty()) {
            while (dests.containsKey(stack.peek()) && !dests.get(stack.peek()).isEmpty()) {
                stack.push(dests.get(stack.peek()).poll());
            }
            res.add(0, stack.pop());
        }
        return res;
    }
}
