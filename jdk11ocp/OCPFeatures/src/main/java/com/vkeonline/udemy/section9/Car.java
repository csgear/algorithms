package com.vkeonline.udemy.section9;

public class Car extends Vehicle {
    public Car(String owner) {
        super(owner);
    }

    @Override
    void makeNoise() {
        System.out.println("Make noise");
    }

    public static void main(String[] args) {
        Car car = new Car("Philip");
        car.PrintOwner();
        System.out.println(car instanceof Vehicle);
        System.out.println(car instanceof Car);
    }
}

abstract class AbstractClass {

    final void myOwnMethod() {  // Line 1
        System.out.println("my own");
    }

    void familyMethod() {
        System.out.println("my family");
        printFamilyTree();  // Line 2
    }

    abstract void printFamilyTree();
}

abstract class Test extends AbstractClass {  // Line 3
    public static void main(String[] args) {
        printFamilyTrees();
    }


    public static void printFamilyTrees() {   // Line 4
//        Test t = new Test();   // Line 5
//        t.printFamilyTree();  // Line 6
    }
}
