package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class NIO2FeaturesTest {
    static NIO2Features nio2Features = new NIO2Features() ;

    @Test
    void comparePathObjects() throws IOException {
        nio2Features.comparePathObjects();
    }

    @Test
    void checkAllJavaFiles() throws IOException {
        nio2Features.checkAllJavaFiles();
    }
}