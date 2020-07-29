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

        float foo = 2, bar = 3, baz = 4;
        float mod1 = foo % baz, mod2 = baz % foo;
        float val = mod1 > mod2 ? bar : baz;
        System.out.println(val);
    }
}

