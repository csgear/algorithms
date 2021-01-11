package com.vkeonline.lintcode.p800;

import java.util.Arrays;

/**
 * Lint code: 840. Range Sum Query - Mutable
 * @author csgear
 */
public class RangeSumQuery {
    class NumArray {
        int[] data, tree ;
        int n ;
        public NumArray(int[] nums) {
            n = nums.length ;
            data = new int[nums.length ] ;
            tree = new int[nums.length + 1] ;
            for (int i = 0; i < n; i++) {
                data[i] = nums[i] ;
                add(i, data[i]) ;
            }
        }

        public void update(int index, int val) {
            add(index, val - data[index]);
            data[index] = val;
        }

        public int sumRange(int i, int j) {
            return sum(j) - sum(i-1) ;
        }

        private int sum(int index) {
            index++;
            int res = 0;
            while (index > 0) {
                res += tree[index];
                index -= lowbit(index);
            }
            return res;
        }

        private void add(int index, int val) {
            index++ ;
            while (index <= n) {
                tree[index] += val ;
                index += lowbit(index) ;
            }
        }
        private int lowbit(int x) {
            return x & (-x) ;
        }
    }
}
