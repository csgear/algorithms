package com.vkeonline.leetcode.p1600;

/**
 * Leetcode [H]: 1649. Create Sorted Array through Instructions
 * @author csgear
 */
public class CreateSortedArrayThroughInstructions {
    private int[] count;
    private final int limit = (int)1e5 + 1;

    public int createSortedArray(int[] instructions) {
        int totalCost = 0;
        this.count = new int[limit];
        for(int i = 0; i < instructions.length; i++) {
            int smallerNumberCount = getCount(instructions[i] - 1);
            int greaterNumberCount = i - getCount(instructions[i]);
            int mod = (int) 1e9 + 7;
            totalCost = (totalCost + Math.min(smallerNumberCount, greaterNumberCount)) % mod;
            updateCount(instructions[i]);
        }
        return totalCost;
    }


    /**
     * Using binary indexed tree
     */
    private void updateCount(int number) {
        while(number < limit) {
            count[number]++;
            number += number & -number;
        }
    }

    private int getCount(int number) {
        int res = 0;
        while(number > 0) {
            res += count[number];
            number -= number & -number;
        }
        return res;
    }
}
