package com.vkeonline.leetcode;

public class _866 {
    public static void main(String[] args) {
        Solution solution = new Solution() ;
        System.out.println(solution.primePalindrome(102));
    }

    static class Solution {
        public int primePalindrome(int N) {
            if (N >= 8 && N <= 11) return 11;

            for (int i = 1; i < 1e5; ++i) {
                int num = buildPalindrome(i) ;
                if(isPrime(num) && num >= N) return num ;
            }

            return -1 ;
        }


        boolean isPrime(int num) {
            if (num < 2 || num % 2 == 0) return num == 2;
            int limit = (int)Math.sqrt(num);
            for (int i = 3; i <= limit; ++i) {
                if (num % i == 0) return false;
            }
            return true;
        }

        int buildPalindrome(int n) {
            StringBuilder sb = new StringBuilder(Integer.toString(n)) ;
            String rsb = new StringBuilder(sb).reverse().toString().substring(1) ;
            return Integer.parseInt(sb.append(rsb).toString()) ;
        }
    }
}
