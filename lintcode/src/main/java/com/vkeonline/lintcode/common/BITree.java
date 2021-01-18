package com.vkeonline.lintcode.common;

/**
 * @author csgear
 */
public class BITree {
    private int[] bit;

    public BITree(int size) {
        bit = new int[size + 1];
    }

    public void increase(int index, int delta) {
        index++;
        for (int i = index; i < bit.length; i += lowbit(i)) {
            bit[i] += delta;
        }
    }

    public int query(int index) {
        index++;
        int sum = 0;
        
        for (int i = index; i > 0; i = i - lowbit(i)) {
            sum += bit[i];
        }
        return sum;
    }

    private int lowbit(int x) {
        return x & (-x);
    }
}


