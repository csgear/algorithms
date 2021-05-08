package com.vkeonline.leetcode.p000;

import java.util.Arrays;

/**
 * leetcode: 45 Jump game II
 * @author csgear
 */
public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }
}
