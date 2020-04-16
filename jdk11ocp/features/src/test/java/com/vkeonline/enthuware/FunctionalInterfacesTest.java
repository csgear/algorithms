package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FunctionalInterfacesTest {
    static FunctionalInterfaces fi = new FunctionalInterfaces() ;
    @Test
    void checkPredicate() {
        fi.checkPredicate();
    }
}