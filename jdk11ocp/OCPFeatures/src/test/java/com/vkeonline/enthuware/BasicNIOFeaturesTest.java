package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicNIOFeaturesTest {
    static BasicNIOFeatures bnio = new BasicNIOFeatures() ;

    @Test
    void comparePath() {
        bnio.comparePaths() ;
    }
}