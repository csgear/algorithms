package com.vkeonline.enthuware.exam816;

import java.util.*;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * @author csgear
 */
public class CollectionFeatures {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>();
        TreeSet<Integer> subs = new TreeSet<>();
        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        subs = (TreeSet) s.subSet(326, true, 328, true);
        subs.add(329);
        System.out.println(s + " " + subs);
        HashMap<?, List<String>> box = new HashMap<String, List<String>>(10);

    }

    static void checkOfAndCopyOf() {
        String[] arrays = new String[]{"a", "b", "c"};
        List<String> list1 = Arrays.asList(arrays);
        List<String> list2 = List.of(arrays);
        List<String> list3 = List.copyOf(list2);
        System.out.println("list 1 " + list1);
        System.out.println("list2 " + list2);
        System.out.println("list3 " + list3);
        list1.set(0, "Hello");
        System.out.println(list1);
        Arrays.stream(arrays).forEach(System.out::print);
        System.out.println();
        arrays[0] = "World";
        System.out.println(list1);
        System.out.println(list2);
    }

    static void checkHowToChangeListElements() {
        List<String> letters = Arrays.asList("j", "a", "v", "a");

        System.out.println(letters.stream().collect(Collectors.joining()).toUpperCase());
        letters.forEach(letter -> System.out.print(letter.toUpperCase()));

        UnaryOperator<String> uo = str -> str.toUpperCase();
        letters.replaceAll(uo);
        letters.forEach(System.out::print);
    }

    static void checkOptionalWithNull() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        double d = list.stream().filter(x -> x < 1).mapToInt(x -> x).average().getAsDouble();
        System.out.println(d);
    }

    static void subSetFunction() {
        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();
        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }
        subs = (TreeSet) s.subSet(326, true, 328, true);
        subs.add(329);
        System.out.println(s + " " + subs);
    }

    /**
     * both list1 and list2 in this method is immutable
     */
    static void immutableList() {
        List<String> list1 = List.of("A", "B");
        List<String> list2 = List.copyOf(list1);
        // of() and copyOf() returns an immutable list, whose elements cannot be added or removed
        list1.add("C");
        list2.add("D");
        System.out.println(list1 + " " + list2);
    }

    /**
     * of() method does not allow null elements
     */
    @SuppressWarnings("unused")
    static void unmodifiableList() {
        var numA = new Integer[]{1, null, 3};
        var list1 = List.of(numA);
        var list2 = Collections.unmodifiableList(list1);
        numA[1] = 2;
        System.out.println(list1 + " " + list2);
    }

    static void listOfAndCopyOf() {
        // the elements of immutable list can be changed
        var numA = new Integer[]{1, 2};
        var list1 = List.of(numA);
        numA[0] = 2;
        var list2 = List.copyOf(list1);
        System.out.println(list1 + " " + list2);

        // after immutable list created
        Collection<Number> col = new HashSet<>();
        col.add(1);
        // list 3 contains one element which is the collection
        var list3 = List.of(col);
        col.add(2);
        var list4 = List.copyOf(col);
        System.out.println("size of list3 : " + list3.size());
        System.out.println(list3 + ", " + list4);
    }

    static void checkPollMethod() {
        Deque<Integer> d = new ArrayDeque<>();
        d.push(1);
        d.push(2);
        d.push(3);
        System.out.println(d.pollFirst());
        System.out.println(d.poll());
        System.out.println(d.pollLast());
    }

    @SuppressWarnings("unused")
    static void dequeWithStackOps() {
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.add(1);
        d1.addFirst(2);
        d1.pop();
        d1.offerFirst(3);
        System.out.println(d1);

        Deque<Integer> d2 = new ArrayDeque<>();
        d2.push(1);
        d2.offerLast(2);
        d2.push(3);
        d2.peekFirst();
        d2.removeLast();
        d2.pop();
        System.out.println(d2);
    }


}
