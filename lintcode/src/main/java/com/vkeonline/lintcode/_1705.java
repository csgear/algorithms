package com.vkeonline.lintcode;

import java.util.Arrays;

public class _1705 {
    public static void main(String[] args) {
        String A = "abcd,aabc,bd" ;
        String B = "aaa,aa" ;

        Solution solution = new _1705().new Solution() ;
        solution.compareStringii(A, B) ;
    }
    public class Solution {
        /**
         * @param A: a string
         * @param B: a string
         * @return: returns an array C of N integers
         */
        public int[] compareStringii(String A, String B) {
            // write your code here
            String[] as = A.split(",") ;
            String[] bs = B.split(",") ;
            int[] cnt_a = new int[as.length] ;
            int[] cnt_b = new int[bs.length] ;

            for(int i = 0 ; i < as.length ; i++)
                cnt_a[i] = count(as[i]) ;

            for(int i = 0 ; i < bs.length ; i++) {
                cnt_b[i] = count(bs[i]) ;
            }

            // Arrays.asList(cnt_b).forEach(System.out::print);

            int[] result = new int[bs.length] ;

            for(int i = 0 ; i < cnt_b.length ; i++) {
                int count = 0 ;
                for(int j = 0 ; j < cnt_a.length ; j++) {
                    if( cnt_a[i] > cnt_b[j]) count++ ;
                }
                result[i] = count ;
            }

            return result ;
        }

        private int count(String s) {
            int result = 0 ;
            char min = 'z' ;

            for(char c: s.toCharArray()) {
                if(c < min) {
                    min = c ;
                    result = 1 ;
                }
                else if(c == min) {
                    result++ ;
                }
            }

            return result ;
        }
    }
}
