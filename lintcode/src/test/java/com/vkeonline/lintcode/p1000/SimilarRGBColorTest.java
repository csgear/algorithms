package com.vkeonline.lintcode.p1000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarRGBColorTest {

    @Test
    void similarRGB() {
        SimilarRGBColor similarRGBColor = new SimilarRGBColor() ;
        String color  ;
        color = "#09f166" ;
        System.out.println(similarRGBColor.similarRGB(color));
    }
}