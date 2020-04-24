package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssessmentThreeUnitTest {
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
    public void checkLoop() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int counter = 0;
        for (int value : arr) {
            if (counter >= 5) {
                break;
            } else {
                continue;
            }
//            if (value > 4) {
//                arr[counter] = value + 1;
//            }
//            counter++;
        }
        System.out.println(arr[counter]);

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

    @Test
    void checkHouse() {
        at.checkHouse();
    }
}