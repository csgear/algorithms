
package com.vkeonline.leetcode.p900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Leetcode [M]: 967. Numbers With Same Consecutive Differences
 *
 * @author csgear
 */
public class NumbersSameConsecutiveDifferences {
    public int[] numsSameConsecDiff(int n, int k) {
        if (n == 1) {
            return new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        }

        List<Integer> queue = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        for (int level = 1; level < n; ++level) {
            ArrayList<Integer> nextQueue = new ArrayList<>();
            for (Integer num : queue) {
                int tailDigit = num % 10;
                ArrayList<Integer> nextDigits = new ArrayList<>();
                nextDigits.add(tailDigit + k);
                if (k != 0) {
                    nextDigits.add(tailDigit - k);
                }
                for (Integer nextDigit : nextDigits) {
                    if (0 <= nextDigit && nextDigit < 10) {
                        Integer newNum = num * 10 + nextDigit;
                        nextQueue.add(newNum);
                    }
                }
            }
            queue = nextQueue;
        }

        return queue.stream().mapToInt(i -> i).toArray();
    }
}
