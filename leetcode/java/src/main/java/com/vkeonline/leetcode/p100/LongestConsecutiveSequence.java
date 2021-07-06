package com.vkeonline.leetcode.p100;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Leetcode [M]: 128. Longest Consecutive Sequence
 *
 * @author csgear
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int longestStreak = 0;

        for (int num : numSet) {
            // check in asc order
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
