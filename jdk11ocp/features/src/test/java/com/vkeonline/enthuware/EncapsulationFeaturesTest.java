package com.vkeonline.enthuware;

import com.vkeonline.enthuware.exam815.EncapsulationFeatures;
import org.junit.jupiter.api.Test;

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