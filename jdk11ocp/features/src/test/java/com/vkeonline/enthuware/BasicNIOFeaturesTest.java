package com.vkeonline.enthuware;

import com.vkeonline.enthuware.exam816.BasicNIOFeatures;
import org.junit.jupiter.api.Test;

class BasicNIOFeaturesTest {
    static BasicNIOFeatures bnio = new BasicNIOFeatures() ;

    @Test
    void comparePath() {
        bnio.comparePaths() ;
    }
}