package com.vkeonline.enthuware.exam816;

class FlavorsEnum {
    enum Flavors {
        VANILLA, CHOCOLATE, STRAWBERRY,
    }

    public static void main(String[] args) {
        for (final var e : Flavors.values()) {
            System.out.println(e.ordinal() + " ");
        }
    }
}

class Moive {
    private int butter = 10;

    class Popcorn {
        public int butter = 20;

        public void startMovie() {
            System.out.println(butter);
            System.out.println(Moive.this.butter);
        }

    }

    public static void main(String[] args) {
        var movie = new Moive();
        var popcorn = new Moive().new Popcorn();
        popcorn.startMovie();
    }
}