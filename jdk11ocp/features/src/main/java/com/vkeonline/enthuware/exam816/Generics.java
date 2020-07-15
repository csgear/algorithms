package com.vkeonline.enthuware.exam816;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 */
public class Generics {
    class  A {}
    class B extends  A {}
    class C extends B {}
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<A>() ;
        List<? extends  A> list2 = new ArrayList<A>() ;
        List<? super  A> list3 = new ArrayList<A>() ;

    }
}
