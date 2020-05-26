package com.vkeonline.udemy.section9;

class BaseClass {
    public void showNumbers(int... nums) {
        System.out.println("Base showNumbers");
    }
}


public class OverloadOverride extends BaseClass {
    public static String Name ;
    private final String address = "" ;

    public OverloadOverride(String address) {

    }

    @Override
    public void showNumbers(int[] nums) {
        System.out.println("Derived show numbers");
    }

    public static void main(String[] args) {
        BaseClass b = new BaseClass() ;
        OverloadOverride d = new OverloadOverride("Cedar") ;
        d.showNumbers(new int[] {1,2,3});
        b.showNumbers(1,2,3);
    }
}
