package com.vkeonline.enthuware;

/**
 * @author csgear
 */
public class FoundationTest {
    class Zebra {
        private int x = 24;

        public int hunter() {
            String message = "x is ";
            abstract class Stripes {
                private int x = 0;

                public void print() {
                    System.out.println(message + Zebra.this.x);
                }
            }
            var s = new Stripes() {
            };

            s.print();
            return x;
        }
    }

    public static void main(String[] args) {
        new FoundationTest().new Zebra().hunter();
    }

    private interface Wild {
    }

}

interface BigCat {
    abstract String getName();

    private void roar() {
        getName();
    }

    private static boolean seank() {
        return true;
    }

    default float rest() {
        return 2;
    }
}

