package com.vkeonline.enthuware;

public class UsingLoops {
    /**
     * check the existing condition
     */
    public void checkOperators() {
        int i = 1, j = 10 ;
        do {
            if(i++ < --j) continue;
        } while(i < 5) ;

        System.out.println("i = " + i + " j = " + j);
    }
}
