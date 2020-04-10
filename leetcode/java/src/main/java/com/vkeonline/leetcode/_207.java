package com.vkeonline.leetcode;

import java.util.*;

public class _207 {
    public static void main(String[] args) {
        Solution solution = new _207().new Solution();
        int numCourses = 1;
        int[][] prerequisites = new int[][]{};

        System.out.println(solution.canFinish(numCourses, prerequisites));
    }

    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            Map<Integer, Integer> nodeInDegree = new HashMap<>();

            for (int i = 0; i < numCourses; i++) {
                nodeInDegree.put(i, 0);
            }

            for (int[] prerequisite : prerequisites) {
                nodeInDegree.put(prerequisite[0],
                        nodeInDegree.getOrDefault(prerequisite[0], 0) + 1);
                ;
            }

            Deque<Integer> deque = new ArrayDeque<>();

            for (Integer n : nodeInDegree.keySet()) {
                if (nodeInDegree.get(n) == 0)
                    deque.offer(n);
            }

            List<Integer> result = new ArrayList<>();

            while (!deque.isEmpty()) {
                Integer current = deque.poll();
                result.add(current);

                for (int[] prerequisite : prerequisites) {
                    if (prerequisite[1] == current) {
                        nodeInDegree.put(prerequisite[0],
                                nodeInDegree.getOrDefault(prerequisite[0], 0) - 1);
                        if (nodeInDegree.get(prerequisite[0]) == 0) {
                            deque.offer(prerequisite[0]);
                        }
                    }
                }
            }

            return result.size() == numCourses;
        }
    }
}
