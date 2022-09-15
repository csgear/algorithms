
package com.vkeonline.leetcode.p1500;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 1570. Dot Product of Two Sparse Vectors
 * @author csgear
 */
public class DotProductSparseVectors {

    static class SparseVector {

        Map<Integer, Integer> hMap = new HashMap<>();

        SparseVector(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    hMap.put(i, nums[i]);
                }
            }
        }

        public int dotProduct(SparseVector vec) {
            if (this.hMap.size() == 0 || vec.hMap.size() == 0) {
                return 0;
            }
            int res = 0;
            for (int n : hMap.keySet()) {
                if (vec.hMap.containsKey(n)) {
                    res += hMap.get(n) * vec.hMap.get(n);
                }
            }
            return res;
        }
    }
}
