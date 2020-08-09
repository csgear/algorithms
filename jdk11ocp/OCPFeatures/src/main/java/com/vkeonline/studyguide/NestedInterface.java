package com.vkeonline.studyguide;

public interface NestedInterface {
    void outerMethod() ;

    /**
     * the inner interface is meant to be static
     */
    interface InnerInterface {
        int b = 0 ;
        void innerMethod() ;

    }
}
