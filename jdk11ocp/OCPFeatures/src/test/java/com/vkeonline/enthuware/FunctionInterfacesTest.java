package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class FunctionInterfacesTest {

    @Test
    void check1() {
        List<Integer> values = Arrays.asList(2,4,6,9) ;
        Predicate<Integer>  check = i -> {
            System.out.println("Checking");
            return i == 4 ;
        } ;

        Predicate<Integer> even = i -> i % 2 == 0 ;

        values.stream().filter(check).filter(even).count() ;
    }

    @Test
    void check2() {
        List<String>  strList = Arrays.asList("a", "aa", "aaa") ;
        Function<String, Integer> f = x -> x.length() ;
        Consumer<Integer>  c = x -> System.out.println("Len: " + x);
        strList.stream().map(f).forEach(c);
    }

    @Test
    void check3() {
        StringBuilder sb = new StringBuilder("abcdef");
        Function<Character, String> f = i -> "" + Character.valueOf((char) (i+1)) ;
        for(int i = 0 , k = sb.length() ; i < k ; i++) {
            sb.replace(i, i + 1, f.apply(sb.charAt(i))) ;
        }

        System.out.println(sb);
    }

}