package com.vkeonline.enthuware.exam816;

import java.util.List;

/**
 * @author csgear
 */
public class EnumFeatures {
    enum Card {
        SPADE
    }


    static void printEnumsNames() {
        List.of(Coffee.values()).stream().forEach(e -> {
            System.out.print(e.name() + ":" + e.ordinal() + " " + e + " ");
        });
    }

    static enum Coffee {
        /**
         * ESPRESSO, MOCHA, LATTE
         */
        ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");
        private String strength;

        Coffee(String strength) {
            this.strength = strength;
        }

        @Override
        public String toString() {
            return strength;
        }
    }

    static enum Title {
        MR("Mr. "), MRS("Mrs. "), MS("Ms. ");
        private String title;

        Title(String s) {
            title = s;
        }

        public String format(String first, String last) {
            return title + " " + first + " " + last;
        }
    }

    static enum Title1 {
        DR;
        private Title t = Title.MR;
        public String format(String s) {
            return t.format(s, s);
        }
    }

    static void someMethod1() {
        System.out.println(Title.MR.format("Rob", "Miller"));

    }

    public static void main(String[] args) {
        for(var c: Coffee.values()) {
            System.out.print( c+ " " + c.name()) ;

        }
    }


}

/**
 * @author csgear
 */
enum WorkingHours {
    Monday,
    Tuesday
}

