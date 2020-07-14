package com.vkeonline.enthuware.exam815;

import java.util.Arrays;
import java.util.List;


public class CollectionsFeatures {
    /**
     * Note: binarySearch returns -1 if nothing is found
     */
    public void checkBinarySearch() {
        String[] sa = {"a", "aa", "aaa", "aaaa"} ;
        Arrays.sort(sa) ;
        String search = "" ;
        System.out.println(Arrays.binarySearch(sa, search)) ;
        System.out.println(Arrays.binarySearch(sa, "A"));
    }

    class Boody {}
    class Dooby extends  Boody {}
    class Tooby extends  Dooby {}

    Boody b = new Boody() ;
    Tooby t = new Tooby() ;

    /**
     * Thus, if you try to add any object to dataList, it has to be a assignable to Dooby.
     * Further, if you try to take some object out of dataList, that object will be of a
     * class that is either Dooby or a Superclass of Dooby.
     * @param
     */
    private void do1(List<? super Dooby> dataList) {
        dataList.add(t) ;
        // this should cause runtime error
        // t = (Tooby) dataList.get(0) ;
        Object o = dataList.get(0) ;
    }

    /**
     * Since we don't know which subclass of Dooby is the list composed of,
     * there is no way you can add any object to this list
     * @param dataList
     */
    private void do2(List<? extends Dooby> dataList) {
        // each object extends Dooby is an object of Boody
       b = dataList.get(0) ;
       // dataList.add(t) ;
    }

    public void checkConVariant() {

    }
}
