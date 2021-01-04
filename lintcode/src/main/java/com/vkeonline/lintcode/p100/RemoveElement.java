package com.vkeonline.lintcode.p100;

/**
 * Lint code: 172. Remove Element
 * @author csgear
 */
public class RemoveElement {
    /**
     * @param A: A list of integers
     * @param elem: An integer
     * @return The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        int start = 0 ;
        int end = A.length - 1 ;
        while(start <= end) {
            if(A[start] == elem) {
                A[start] = A[end--] ;
            }
            else {
                start++ ;
            }
        }

        return end + 1 ;
    }
}
