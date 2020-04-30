package com.vkeonline.studyguide;

import com.vkeonline.enthuware.z815.AssessmentThree;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class AssessmentThreeTest {
    AssessmentThree at = new AssessmentThree();

    @Test
    public void check1() {
        at.checkInstanceOf();
    }

    @Test
    void checkSwitchExpression() {
        // Integer condition = new Integer("1") ;
        // Byte condition = 1 ;

        var condition = Integer.valueOf("1");

        switch (condition) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
        }

        String str1 = "str1";
        String str2 = "str2";
        System.out.println(str1.concat(str2));
        System.out.println(str1);
    }

    @Test
    void stringTest() {
        at.stringRecap();
    }

    @Test
    void unaryTest() {
        at.UnaryOpersRecap();
        int number = 0;
        int result;

        result = --number - number--;
        System.out.println(result);
        result = number-- - --number;
        System.out.println(result);
    }

    @Test
    void arrayTest() {
        at.ArraysRecap();
    }

    @Test

    public void checkLoop() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
                continue;
            }
            // this block is unreachable and will cause compilation error
//            if (value > 4) {
//                arr[counter] = value + 1;
//            }
//            counter++;
        }
        System.out.println(arr[counter]);

        int count = 0, sum = 0;
        do {
            if (count % 3 == 0) continue;
            sum += count;
        }
        while (count++ < 11);
        System.out.println(sum);

        // now we have byte variables, overflow will cause infinite loop
        assertTimeoutPreemptively(Duration.ofMillis(200), () -> {
                    byte i, j;
                    int variable = 0;
                    for (i = 100, j = 0; i <= 300; i += 90, j++) {
                        variable = i % 50;
                        System.out.print(variable + " ");
                    }
                    System.out.println(j);
                }
        );
    }

    @Test
    public void checkLoopWithVariableScope() {
        class LoopTest {
            int k = 5;

            public boolean checkIt(int k) {
                return k-- > 0;
            }

            public void printThem() {
                while (checkIt(k)) {
                    System.out.print(k--);
                }
            }
        }
        new LoopTest().printThem();
    }

    @Test
    public void checkLoopWithBreakLabel() {
        int c = 0;
        A:
        for (int i = 0; i < 2; i++) {
            B:
            for (int j = 0; j < 2; j++) {
                C:
                for (int k = 0; k < 3; k++) {
                    c++;
                    if (k > j) break;
                }
            }
        }
        System.out.println(c);
    }


    @Test
    public void checkSwitch() {
        char i;
        LOOP:
        for (i = 0; i < 5; i++) {
            switch (i++) {
                case '0':
                    System.out.println("A");
                case 1:
                    System.out.println("B");
                    break LOOP;
                case 2:
                    System.out.println("C");
                    break;
                case 3:
                    System.out.println("D");
                    break;
                case 4:
                    System.out.println("E");
                case 'E':
                    System.out.println("F");
            }
        }
        byte x = 0;
        switch (x) {
            case 'a':   // 1
//            case 256:   // 2
            case 0:     // 3
            default:   // 4
            case 80:    // 5
        }
    }

}