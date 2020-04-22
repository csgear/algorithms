package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimitiveDataTypeTest {
    static PrimitiveDataType pdt = new PrimitiveDataType() ;
    @Test
    void myMethod() {
        pdt.myMethod("a", "b");
    }

    @Test
    void checkFloat() {
        float f1 = 102 ;
        float f2 = (int) 102.0 ;
        // 0.0 default is double, won't compile
        // float f3 = 1f * 0.0 ;
        float f4 = 1f * (short) 0.0 ;
        // 0 can not be converted to int, only string and boolean
        // float f5 = 1f * (boolean) 0 ;

    }
}