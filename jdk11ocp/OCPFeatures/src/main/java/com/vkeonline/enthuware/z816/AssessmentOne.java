package com.vkeonline.enthuware.z816;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 1) enum is a type, which can not be defined as a local variable.
 * 2) inner class can access final or effective final local variable, class instance variables
 * 3)
 */
public class AssessmentOne {
}


// exception question
class LowBalanceException extends WithdrawalException {
    public LowBalanceException(String msg) {
        super(msg);
    }
}

class WithdrawalException extends Exception {
    public WithdrawalException(String msg) {
        super(msg);
    }
}

class Account {
    double balance;

    public void withdraw(double amount) throws WithdrawalException {
        try {
            throw new RuntimeException("Not Implemented");
        } catch (Exception e) {
            throw new LowBalanceException(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            Account a = new Account();
            a.withdraw(100.0);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}


// enum questions
//public enum EnumA{ A, AA, AAA};  //1

class TestClass //2
{
    public enum EnumB {B, BB, BBB}

    public static enum EnumC {C, CC, CCC}

    public TestClass() {
//        enum EnumD {D, DD, DDD} //5
    }

    public void methodX() {
//        public enum EnumE {E, EE, EEE} //6
    }

    public static void main(String[] args) //7
    {
//        enum EnumF {F, FF, FFF}
    }
}

// inner class question
class BookStore {
    private static final int taxId = 300000;
    private String name;

    public String searchBook(final String criteria) {
        int count = 0;
        int sum = 0;
        name = "";
        sum++;
        class Enumerator {
            String iterate(int k) {
                // line1
                System.out.println(count + " " + name + " " + criteria);

                return "";
            }
        }

        return "";
    }
}

interface House {
    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {
    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House, Office {
    private boolean isOffice() {
        return true;
    }
}

class HomeOffice implements House, Office {
    public String getAddress() {
        return "R No 1, Home";
    }
}

class TestClass1 {
    public static void main(String[] args) {
        Office off = new HomeOffice();
//        System.out.println(off.getAddress());
        List<String> names = Arrays.asList("greg", "dave", "don", "ed", "fred");
        Map<Integer, Long> data = names.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(data.values());
    }
}

// tough generic question
class Counter<T> {
    T t;

    public int count(T[] ta, T t) {
        this.t = t;
        int count = 0;
        for (T x : ta) {
            count = x == t ? count + 1 : count;
        }
        return count;
    }
}

class Person {
    String name;
    String dob;

    public Person(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }
}

class MySorter {
    public int compare(Person p1, Person p2) {
        return p1.dob.compareTo(p2.dob);
    }
}

class SortTest {
    public static int diff(Person p1, Person p2) {
        return p1.dob.compareTo(p2.dob);
    }

    public static int diff(Date d1, Date d2) {
        return d1.compareTo(d2);
    }

    public static void main(String[] args) {
        ArrayList<Person> al = new ArrayList<>();
        al.add(new Person("Paul", "01012000"));
        al.add(new Person("Peter", "01011990"));
        al.add(new Person("Patrick", "01012002"));
        java.util.Collections.sort(al, SortTest::diff);
        al.forEach(System.out::println);
        Deque<Integer> d = new ArrayDeque<>();
        d.add(1);
        d.add(2);
        d.addFirst(3);
        System.out.println(d.pollLast());
        System.out.println(d.pollLast());
        System.out.println(d.pollLast());

        IntStream is1 = IntStream.range(0, 5);
        OptionalDouble d1 = is1.average() ;
        System.out.println(d1);
    }
}

class TopClass {
    public Inner inner1 = new Inner() {
        public void doA() {
            System.out.println("doing A");
        }
    };

//    public void doA() {
//        inner1.doA();
//    }
}

class Inner {
    int value;
}

class Request {
}

class RequestCollector {
    Queue<Request> container = new LinkedList<Request>();
    public synchronized void addRequest(Request r) {
        container.add(r);
    }

    public synchronized Request getRequestToProcess() {
        return container.poll();
    }
}