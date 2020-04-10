package com.vkeonline.whizlabs;

interface Calculable {
    int change(int i);

    default int change(long l) {
        return (int) l * 3;
    }
}


public class Question3 {
    public static void main(String[] args) {
        Calculable calculable = l -> l * 2;
        System.out.println(calculable.change(1));
    }
}

