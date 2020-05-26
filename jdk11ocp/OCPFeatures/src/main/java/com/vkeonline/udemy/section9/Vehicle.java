package com.vkeonline.udemy.section9;

public abstract class Vehicle {
    private final String owner ;

    public Vehicle(String owner) {
        this.owner = owner ;
    }

    public final void PrintOwner() {
        System.out.println("Owner "+ this.owner);
    }

    abstract void makeNoise() ;
}
