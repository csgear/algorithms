package com.vkeonline.studyguide;

/**
 * @author csgear
 */
public class MethodEncapsulation {

    public static void main(String[] args) {
        OverrideTest ot = new OverrideTest() ;
        ot.baa("hello");
    }
}

class OverloadTest {
    public void baa(String s) {
        System.out.println("base s");
    }
    public void baa(CharSequence c) {
        System.out.println("base char sequence");
    }
}
class OverrideTest extends  OverloadTest {
    @Override
    public void baa(String s) {
        System.out.println("extended s");
    } ;
}