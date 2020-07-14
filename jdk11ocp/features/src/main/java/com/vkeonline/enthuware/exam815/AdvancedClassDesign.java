package com.vkeonline.enthuware.exam815;

interface Otter {
    default void play() {}
}

/**
 * 1) every method inside a interface is public
 */
public class AdvancedClassDesign implements  Otter {
    @Override public void play() {}
    @Override public int hashCode() {return 42 ;}
    @Override public boolean equals(Object o) { return false ; }
    public void checkOverride() {

    }

    public void whichDate() {
//        Date d = new Date() ;

    }
}
