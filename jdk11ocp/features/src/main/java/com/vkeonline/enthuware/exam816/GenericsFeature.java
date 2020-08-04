package com.vkeonline.enthuware.exam816;

import java.util.*;

/**
 * @author csgear
 */
public class GenericsFeature {
    public static void main(String[] args) {
        wildcardTest();
        checkCollectionApis();
    }

    static void wildcardTest() {
        String[] names = {"Alex", "Bob", "Charlie"};
        List<String> l1 = new ArrayList<>(Arrays.asList(names));
        System.out.println(l1.get(0));
        List<?> l2 = new ArrayList<>(Arrays.asList(names));
        System.out.println(l2.get(0));
    }

    static void streamOpOnClosed() {
        List<Integer> ls = Arrays.asList(1, 2, 3);
        ls.stream().map(a -> a * 2).forEach(System.out::print);
    }

    static void checkCollectionApis() {
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.push(2);
        d.pop();
        d.offerFirst(3);
        d.remove();
        System.out.println(d);
    }


}

class PlaceHolder<K, V> {
    private K k;
    private V v;

    public PlaceHolder(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public static <X> PlaceHolder<X, X> getDuplicateHolder(X x) {
        return new PlaceHolder<X, X>(x, x);
    }

    public static void main(String[] args) {
        PlaceHolder<String, String> ph1 = PlaceHolder.getDuplicateHolder("b");
//        PlaceHolder<String, String> ph2 = PlaceHolder < String >.getDuplicateHolder("b"); //2
//        PlaceHolder<String, String> ph3 = PlaceHolder <>.getDuplicateHolder("b"); //3
//        PlaceHolder<> ph4 = new PlaceHolder<String, String>("a", "b"); //4
        PlaceHolder<?, ?> ph5 = new PlaceHolder(10, 10);
    }
}