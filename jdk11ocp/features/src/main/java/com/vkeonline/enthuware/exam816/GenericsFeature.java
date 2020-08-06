package com.vkeonline.enthuware.exam816;

import java.util.*;

/**
 * @author csgear
 */
public class GenericsFeature {
    public static void main(String[] args) {
        sortWithNullFunctions();
        checkTParameter() ;
        var numA = new Integer[]{1, 2};
        var list1 = new ArrayList<Integer>(List.of(numA));
        list1.add(null);
        var list2 = Collections.unmodifiableList(list1);
        list1.set(2, 3);
        List<List<Integer>> list3 = List.of(list1, list2);
        System.out.println(list3);
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

    static void sortWithNullFunctions() {
        String[] sa = {"charlie", "bob", "andy", "dave"};
        Collections.sort(Arrays.asList(sa), null);
        Arrays.asList(sa).sort(null);
        System.out.println(sa[0]);
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

    static void checkTParameter() {
        MyGenericClass gc = new MyGenericClass();
        System.out.println(gc.transform(1));
        System.out.println(gc.transform("hello"));
        MyGenericClass<String> gcStr = new MyGenericClass<String>();
        System.out.println(gcStr.transform(1.1));
    }

}

class MyGenericClass<T> {
    public <T> String transform(T t) {
        return t.toString() + "-" + t.hashCode();
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
        PlaceHolder<String, String> ph2 = PlaceHolder.<String>getDuplicateHolder("b");
//        PlaceHolder<String, String> ph3 = PlaceHolder <>.getDuplicateHolder("b"); //3
//        PlaceHolder<> ph4 = new PlaceHolder<String, String>("a", "b"); //4
        PlaceHolder<?, ?> ph5 = new PlaceHolder(10, 10);
    }
}