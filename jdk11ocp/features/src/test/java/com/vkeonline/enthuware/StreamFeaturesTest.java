package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

class StreamFeaturesTest {
    static StreamFeatures sf = new StreamFeatures() ;

    @Test
    void testComputeAverage() {
        sf.computeAverage() ;
    }

    @Test
    void getMax() {
        sf.getMax();
    }

    @Test
    void getTenRandomDoubles() {
        sf.getTenRandomDoubles();
    }

    @Test
    void checkJoining() {
        sf.checkJoining();
    }
}