package com.vkeonline.enthuware.exam816;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

/**
 * @author csgear
 */
public class CollectionFeatures {
    public static void main(String[] args) {
        listOfAndCopyOf();
        checkPollMethod() ;
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
        var numA = new Integer[]{1, 2};
        var list1 = List.of(numA);
        numA[0] = 2;
        var list2 = List.copyOf(list1);
        System.out.println(list1 + " " + list2);
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
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.addFirst(2);
        d.pop();
        d.offerFirst(3);
        System.out.println(d);
    }
}
