package com.vkeonline.enthuware;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicNIOFeatureTest {
    static BasicNIOFeature bio = new BasicNIOFeature() ;

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