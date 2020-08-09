package com.vkeonline.enthuware;

import com.vkeonline.enthuware.exam816.FunctionalInterfaces;
import org.junit.jupiter.api.Test;

class FunctionalInterfacesTest {
    static FunctionalInterfaces fi = new FunctionalInterfaces() ;
    @Test
    void checkPredicate() {
        fi.checkPredicate();
    }
}