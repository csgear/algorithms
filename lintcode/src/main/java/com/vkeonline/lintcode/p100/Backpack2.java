package com.vkeonline.lintcode.p100;

/**
 * 125. Backpack II
 *
 * @author csgear
 * Backpack where items can be picked up only once with values
 */
public class Backpack2 {
    public int backPackII(int m, int[] A, int[] V) {
        int[] f = new int[m + 1];

        for (int i = 0; i < A.length; i++) {
            for (int j = m; j >= A[i]; j--) {
                if (f[j] < f[j - A[i]] + V[i]) {
                    f[j] = f[j - A[i]] + V[i];
                }
            }
        }

        return f[m];
    }
}
