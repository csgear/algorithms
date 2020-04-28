package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;


class AssessmentTwoTest {
    /**
     * 1) compare:
     * 2) mismatch: Finds and returns the index of the first mismatch between two int arrays, otherwise return -1 if no
     * mismatch is found. The index will be in the range of 0 (inclusive) up to the length (inclusive) of the smaller array.
     */
    @Test
    void checkArrayMethods() {

        // b is a prefix of a, the result return's a.length - b.length
        char[] a = {'h', 'e', 'l', 'l'};
        char[] b = {'h'};
        int x = Arrays.compare(a, b);
        int y = Arrays.mismatch(a, b);
        System.out.println(x + " " + y);

        // outputs 2 before the different elements == 2
        int[] ia1 = {0, 1, 2, 6};
        int[] ia2 = {0, 1};
        System.out.println(Arrays.compare(ia1, ia2)); //prints 2

        // if a is not a proper prefix of b, return the comparision result of the different element
        var ia3 = new int[] {0, 1, 2, 6};
        var ia4 = new int[] {0, 1, 5,7};
        System.out.println(Arrays.compare(ia3, ia4)); //prints -1

        var ia5 = new int [] {0,1,2,6, 10, 11} ;
        var ia6 = new int [] {0,1,2} ;
        System.out.println(Arrays.compare(ia5, ia6)); //prints 3
    }

    @Test
    public void checkOverriddenMethod() {
        class Top {
            final int value = 10;

            public void m1() {
                System.out.println("In Top");
            }
        }
        class Middle extends Top {
            final int value = 20;

            public void m1() {
                System.out.println("In Middle");
            }
        }

        class Bottom extends Middle {
            final int value = 30;

            public void m1() {
                System.out.println("In Bottom");
            }
        }

        Top top = new Top();
        Middle middle = new Middle();
        Bottom bottom = new Bottom();

        bottom.m1();
        System.out.println(bottom.value);
        // the method is overridden so bottom's m1 is called.
        ((Middle) bottom).m1();
        System.out.println(((Middle) bottom).value);
    }


    @Test
    public void checkStringReplace() {
        System.out.println("String".replace('g', 'g') == "String");  // true
        System.out.println("String".replace('x', 'g') == "String");  // true
        System.out.println("String".replace("g", "g") == "String");  // false
        System.out.println("String".replace("x", "g") == "String");  // true
    }

    @Test
    public void checkForLoop() {

        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j)      // 1
        {
            sum = sum + i + j;
        }
        System.out.println("Sum = " + sum);

        short s2 = 10;   // 1
//        char c = s;     // 2
//        s = c;          // 3


//        int a = 'a';
//        char c = 6;


//        int k = 1;
//        int[] a = {1};
//        k += (k = 4) * (k + 2);
//        a[0] += (a[0] = 4) * (a[0] + 2);
//        System.out.println(k + " , " + a[0]);

        Object a, b, c;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println("" + c);


        System.out.println(
                "    hello java guru   ".strip());

        List<String> s1 = new ArrayList<String>();
        String s = null;
        s1.add("a");
        s1.add(s); //1
        s1.add("b");
        s1.remove(s); //2
        System.out.println(s1); //3

//
//                int value = 0;
//                Supplier<Integer> valueS = ()->value++; //1
//                value++;//2
//                System.out.println(value+" "+valueS.get()); //3

    }


    @Test
    void crazyLoop() {
        int c = 0;
        JACK:
        while (c < 8) {
            JILL:
            System.out.println(c);
            if (c > 3) break JACK;
            else c++;
        }
    }
}
