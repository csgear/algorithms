package com.vkeonline.lintcode.p000;

/**
 * Lint code: 92. Backpack
 * @author csgear
 * Backpack where items can be picked up only once
 */
public class Backpack1 {
    public int backPack(int m, int[] A) {
        int[] f = new int[m+1] ;

        for (int weight : A) {
            for (int j = m; j >= weight; j--) {
                f[j] = Math.max(f[j], f[j - weight] + weight);
            }
        }

        return f[m] ;
    }
}
