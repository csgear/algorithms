package com.vkeonline.lintcode.p1800;

/**
 * Lint code: 1850. Pick Apples
 *
 * @author csgear
 */
public class PickApples {
    public int pickApples(int[] A, int K, int L) {
        if (K + L > A.length) {
            return -1;
        }
        int[] preSum = new int[A.length + 1];
        int[] sufSum = new int[A.length+1] ;
        for (int i = 0; i < A.length; i++) {
            preSum[i+1] = preSum[i] + A[i] ;
        }

        for (int i = A.length; i > 0 ; i--) {
            sufSum[i-1] = sufSum[i] + A[i-1] ;
        }

        int res = 1 ;

        res = Math.max(res, calc(A, K, L, preSum, sufSum)) ;
        res = Math.max(res, calc(A, L, K, preSum, sufSum)) ;

        return res ;
    }

    private int calc(int[] A, int l, int r, int[] preSum, int[] sufSum) {
        int res = -1 ;
        int maxR = 0 ;
        for (int i = A.length - r ; i >= l ; i--) {
            maxR = Math.max(maxR, sufSum[i] - sufSum[i+r]) ;
            res = Math.max(res, maxR + preSum[i] - preSum[i-l]) ;
        }

        return res ;
    }
}
