package com.vkeonline.enthuware;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

class Game {
    static int x = 5;

    public void play() throws Exception {
        System.out.println("Playing...");

        int x = (x = 3) * 4;
    }


    void test(int x) {
        switch (x) {
            case 1:
            case 2:
            case 0:
            default:
            case 4:
            case 'a' | 'b':
                System.out.println('c');
        }
    }
}

class Soccer extends Game {
    @Override
    public void play() {
        System.out.println("Playing Soccer...");
    }


    public static void main(String[] args) throws Exception {
        System.out.println(args.length);
        System.out.println(args == null);
        System.out.println(1 + 5 < 3 + 7);
        System.out.println((2 + 2) >= 2 + 3);

        var values = new ArrayList<String>();
        values.add("hello");
        values.add("world");
        values.add("peter");
        values.sort((a, b) -> a.compareTo(b));
        String[] sa = values.toArray(new String[]{});
        System.out.println(Arrays.toString(sa));
        values.forEach(System.out::println);
        values.sort((var a, var b) -> a.compareTo(b));
        values.removeIf((var k) -> k.equals("a"));
    }
}




