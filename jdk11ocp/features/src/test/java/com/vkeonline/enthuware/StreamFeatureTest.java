package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StreamFeatureTest {
    static StreamFeature sf = new StreamFeature() ;

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