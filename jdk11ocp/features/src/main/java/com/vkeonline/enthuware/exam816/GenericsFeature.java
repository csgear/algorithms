package com.vkeonline.enthuware.exam816;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * @author csgear
 */
public class GenericsFeature {
    public static void main(String[] args) {
        wildcardTest();
    }

    static void wildcardTest() {
        String[] names = {"Alex", "Bob", "Charlie" };
        List<String> l1 = new ArrayList<>(Arrays.asList(names)) ;
        System.out.println(l1.get(0));
        List<?> l2 = new ArrayList<>(Arrays.asList(names)) ;
        System.out.println(l2.get(0));
    }
}
