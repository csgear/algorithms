package com.vkeonline.lintcode;

public class _0008 {
    public static void main(String[] args) {
        Solution solution = new _0008().new Solution() ;
        char[] str = "abcdefg".toCharArray() ;
        String s = "ddd" ;
        solution.rotateString(str, 3);
    }
    public class Solution {
        /**
         * @param str: An array of char
         * @param offset: An integer
         * @return: nothing
         */
        public void rotateString(char[] str, int offset) {
            int n = str.length ;
            offset = offset % n ;
            StringBuilder sb = new StringBuilder() ;
            sb.append(str, n - offset, offset) ;

            sb.append(str, 0, n - offset) ;
            System.out.println(sb.toString()) ;
            for(int i = 0 ; i < n ; i++) {
                str[i] = sb.charAt(i) ;
            }


        }
    }
}
