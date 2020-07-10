package com.vkeonline.enthuware;

/**
 * String is a final class
 */
public class StringFeatures {
    public void checkStringBuilder() {
        StringBuilder sb = new StringBuilder("12345678") ;
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb.length());
    }
    public void checkCharAt() {
        String s = "0123456" ;
        char ch = s.charAt(0) ;
    }

    public static void main(String[] args) {
        String s = "string" ;
        System.out.println(s.replace('g', 'g') == s) ;
        System.out.println("String".replace('g','g')=="String") ;
        System.out.println("String".replace("g","g")=="String");
    }

}
