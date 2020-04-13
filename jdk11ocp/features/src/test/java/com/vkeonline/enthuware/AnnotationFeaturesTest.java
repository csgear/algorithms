package com.vkeonline.enthuware;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnnotationFeaturesTest {
    static AnnotationFeatures af = new AnnotationFeatures() ;

    @Test
    void printAnnotations() {
        af.printAnnotations();
    }

    @Test
    void checkTypeAnnotation() {
        af.checkTypeAnnotation();
    }
}