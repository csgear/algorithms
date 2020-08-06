package com.vkeonline.enthuware.exam816;

import java.util.List;

/**
 * @author csgear
 */
public class EnumFeatures {
    public static void main(String[] args) {
        System.out.println(WorkingHours.Monday);
        System.out.println(WorkingHours.valueOf("Monday"));
        printEnumsNames();
    }

    static void printEnumsNames() {
        List.of(Coffee.values()).stream().forEach(e -> {
            System.out.print(e.name() + ":" + e.ordinal() + " " + e + " " );
        });
    }
    static enum Coffee {
        /**
         * ESPRESSO, MOCHA, LATTE
         */
        ESPRESSO("Very Strong"), MOCHA("Bold"), LATTE("Mild");
        public String strength;

        Coffee(String strength) {
            this.strength = strength;
        }


        @Override
        public String toString() {
            return strength;
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

