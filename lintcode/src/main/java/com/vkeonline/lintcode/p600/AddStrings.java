package com.vkeonline.lintcode.p600;

/**
 * Lintcode: 655. Add Strings
 * @author csgear
 */
public class AddStrings {
    /**
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     */
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int m = num1.length() ;
        int n = num2.length() ;
        int i = m - 1 ;
        int j = n - 1 ;
        int flag = 0 ;

        while(i >= 0 || j >= 0) {
            int a, b ;
            if(i >= 0 ) {
                a = num1.charAt(i--) - '0' ;
            }
            else {
                a = 0;
            }

            if(j >= 0 ) {
                b = num2.charAt(j--) - '0' ;
            }
            else {
                b = 0 ;
            }
            int sum = a + b + flag ;
            sb.insert(0, sum % 10) ;
            flag = sum / 10 ;
        }

        if(flag == 1) {
            sb.insert(0, flag) ;
        }
        return sb.toString() ;
    }
}
