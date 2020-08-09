package com.vkeonline.enthuware.exam815;


/**
 * @author csgear
 */
public class PrimitiveTypes {
    public static void main(String... args) {
        try(var a1 = new MyFileClass(1) ; var a2 = new MyFileClass(2)) {
            throw new RuntimeException() ;
        }
        catch (Exception e) {
            System.out.println("ex");
        }
        finally {
            System.out.println("finally");
        }
    }
}

class MyFileClass implements AutoCloseable {
    private final int num;
    public MyFileClass(int num) { this.num = num; }
    @Override
    public void close() {
        System.out.println("Closing: " + num);
    }
}




