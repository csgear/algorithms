package com.vkeonline.studyguide.z10815;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssessmentTestTest {

    interface Aquatic {
        int getNumOfGills(int p) ;
    }

    final static class A {

    }
    /**
     * inner class can be public, but not method inner class
     */
    public class ClownFish implements Aquatic {

        @Override
        public int getNumOfGills(int p) {
            return 15;
        }

        String getNumOfGills() {
            return "41" ;
        }
    }

    private class PrivateClass {}

    @Test
    void checkAbstract() {
        abstract class Elephant {
            abstract class SleepsALot {
                abstract int sleep() ;
            }
        }
    }

    @Test void testPublicInnerClass() {
        assertEquals(15, new ClownFish().getNumOfGills(-1));

    }

    @Test void checkAbstractMethod() {
        abstract class Bird {
            private final void fly() { System.out.println(("Bird"));}
        }

        class Pelican extends Bird {
            protected  void  fly() { System.out.println("Pelican") ;}
        }

        new PrivateClass() ;
    }
}