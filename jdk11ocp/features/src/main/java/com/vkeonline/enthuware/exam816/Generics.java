package com.vkeonline.enthuware.exam816;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 * @author csgear
 */
public class Generics {
    public static void main(String[] args) {
        var data = new ArrayList<>();
        data.add("A");
        data.add(100);
        data.add("C");
        data.set(0, 200);
        data.remove(2);
        data.set(2, 101L);
        System.out.println(data);

        String val1 = "hello";
        StringBuilder val2 = new StringBuilder("world");
        UnaryOperator<String> uo1 = s1->s1.concat(val1);
        UnaryOperator<String> uo2 = s->s.toUpperCase();
        System.out.println(uo1.apply(uo2.apply(String.valueOf(val2))));
    }
}
