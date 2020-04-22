package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstanceOfOperatorTest {

    @Test
    void checkOperator() {
        InstanceOfOperator io = new InstanceOfOperator() ;
        InstanceOfOperator.B ib = new InstanceOfOperator().new B() ;

        assertTrue(ib instanceof InstanceOfOperator.A);
        assertTrue(ib instanceof InstanceOfOperator.B);
        assertFalse(ib instanceof InstanceOfOperator.C); ;
    }
}