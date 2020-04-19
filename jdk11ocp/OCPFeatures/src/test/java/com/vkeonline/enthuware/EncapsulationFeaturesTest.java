package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulationFeaturesTest {
    static EncapsulationFeatures ef = new EncapsulationFeatures() ;

    @Test
    void checkMemberAccess() {
        ef.checkMemberAccess();
    }

    @Test
    void ScopeTest() {

    }

    @Test
    void checkInitialValues() {
        ef.checkInitialValues();
    }
}