package com.vkeonline.leetcode.p2200;

import java.util.Arrays;

/**
 * Leetcode [N]: 2214. Minimum Health to Beat Game
 *
 * @author csgear
 */
public class MinimumHealthBeatGame {
    public long minimumHealth(int[] damage, int armor) {
        long total = Arrays.stream(damage).asLongStream().sum();
        long max = Arrays.stream(damage).asLongStream().max().getAsLong();
        long sub = Math.min(max, armor);
        return total - sub + 1;
    }
}
