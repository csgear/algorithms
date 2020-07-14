package com.vkeonline.enthuware.exam815;

/**
 * @author csgear
 */
public class Operators {
    public static void main(String[] args) throws Exception {
        System.out.println(1 + 3.5f);
        System.out.println();
        StringBuilder sb = new StringBuilder("12345678");
        sb.setLength(5);
        sb.setLength(10);
        System.out.println(sb.length());
        Exception e = null;
        throw e;
//        System.out.println(null + true);
//        System.out.println(true + null);
//        System.out.println(null + null);
    }

}

