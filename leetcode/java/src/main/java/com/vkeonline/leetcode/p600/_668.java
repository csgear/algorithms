package com.vkeonline.leetcode.p600;

public class _668 {
    class Solution {
        public int findKthNumber(int m, int n, int k) {
            int low = 1 ;
            int high = m * n + 1 ;

            while(low < high) {
                int middle = low + (high - low) / 2 ;
                int cnt = count(middle, m, n) ;
                if(cnt >= k) high = middle ;
                else low = middle + 1 ;
            }
            return low ;
        }

        int count(int v, int m, int n) {
            int count = 0 ;

            for(int i = 1 ; i <= m ; i++ ) {
                count += Math.min(v / i, n) ;
            }
            return count ;
        }
    }
}
