package com.vkeonline.lintcode.p500;

import com.vkeonline.lintcode.common.BITree;

import java.util.Arrays;

/**
 * Lint code: 532. Reverse Pairs
 *
 * @author csgear
 */
public class ReversPairs {
    /**
     * @param A: an array
     * @return total of reverse pairs
     */
    public long reversePairs(int[] A) {
        if (A == null || A.length == 0) {
            return 0;
        }

        BITree biTree = new BITree(A.length);

        int[] sorted = A.clone();
        Arrays.sort(sorted);

        for (int i = 0; i < A.length; i++) {
            A[i] = Arrays.binarySearch(sorted, A[i]);
        }

        int result = 0;
        biTree.increase(A[0], 1);
        for (int i = 1; i < A.length; i++) {
            biTree.increase(A[i], 1);
            result += i - biTree.query(A[i]) + 1;
        }

        return result;
    }
}
