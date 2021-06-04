package com.vkeonline.leetcode.p700;

import java.util.*;

/**
 * Leetcode [M]: 752. Open the Lock
 *
 * @author csgear
 */
public class OpenLock {
    public int openLock(String[] deadends, String target) {
        Set<String> deadSet = new HashSet<>(Arrays.asList(deadends));
        if (deadSet.contains("0000")) {
            return -1;
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");

        int depth = 0;
        while (!queue.isEmpty()) {
            for (int i = queue.size(); i > 0; --i) {
                String curr = queue.poll();
                if (target.equals(curr)) {
                    return depth;
                }
                for (String nei : neighbors(curr)) {
                    if (deadSet.contains(nei)) {
                        continue;
                    }
                    deadSet.add(nei);
                    queue.offer(nei);
                }
            }
            depth++;
        }
        return -1;
    }

    List<String> neighbors(String code) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int x = code.charAt(i) - '0';
            for (int diff = -1; diff <= 1; diff += 2) {
                int y = (x + diff + 10) % 10;
                result.add(code.substring(0, i) + y + code.substring(i + 1));
            }
        }
        return result;
    }
}
