package com.vkeonline.leetcode.p600;

import java.util.Arrays;

/**
 * Leetcode [H]: 679. 24 Game
 * @author csgear
 */
public class TwentyFourGame {
    public boolean judgePoint24(int[] cards) {
        double[] nums = new double[cards.length] ;
        int i = 0 ;
        for(int card: cards) {
            nums[i++] = card ;
        }

        return solver(nums) ;
    }

    private boolean solver(double[] nums) {
        if(nums.length == 1) {
            return Math.abs(nums[0] - 24.0) < 0.00001 ;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                double[] newNums = new double[nums.length - 1];
                for (int k = 0, index = 0; k < nums.length; k++) {
                    if (k != i && k != j) {
                        newNums[index++] = nums[k];
                    }
                }

                for (double r : compute(nums[i], nums[j])) {
                    newNums[newNums.length - 1] = r;
                    if (solver(newNums)) {
                        return true;
                    }
                }
            }
        }
        return false ;
    }

    private double[] compute(double i, double j) {
        return new double[]{i + j, i - j, j - i, i * j, i / j, j / i};
    }

    public static void find24(int[] nums, String expr) {
        if (nums.length == 1) {
            if (nums[0] == 24) {
                System.out.println(expr);
            }
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int[] newNums = new int[nums.length - 1];
                int index = 0;
                for (int k = 0; k < nums.length; k++) {
                    if (k != i && k != j) {
                        newNums[index++] = nums[k];
                    }
                }
                newNums[index] = nums[i] + nums[j];
                find24(newNums, expr + "(" + nums[i] + "+" + nums[j] + ")");
                newNums[index] = nums[i] - nums[j];
                find24(newNums, expr + "(" + nums[i] + "-" + nums[j] + ")");
                newNums[index] = nums[j] - nums[i];
                find24(newNums, expr + "(" + nums[j] + "-" + nums[i] + ")");
                newNums[index] = nums[i] * nums[j];
                find24(newNums, expr + "(" + nums[i] + "*" + nums[j] + ")");
                if (nums[j] != 0) {
                    newNums[index] = nums[i] / nums[j];
                    find24(newNums, expr + "(" + nums[i] + "/" + nums[j] + ")");
                }
                if (nums[i] != 0) {
                    newNums[index] = nums[j] / nums[i];
                    find24(newNums, expr + "(" + nums[j] + "/" + nums[i] + ")");
                }
            }
        }
    }
}
