package com.vkeonline.enthuware;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BasicNIOFeatureTest {
    static BasicNIOFeatures bio = new BasicNIOFeatures() ;

    @BeforeAll
    static void init() {
    }

    @Test
    void checkPath() {
        System.out.println(bio.checkPath()) ;
    }

    @Test
    void testCheckPath() {
        System.out.println(bio.checkPathRoot());
    }

    @Test
    void checkRelativize() {
        System.out.println(bio.checkRelativize());
    }
}