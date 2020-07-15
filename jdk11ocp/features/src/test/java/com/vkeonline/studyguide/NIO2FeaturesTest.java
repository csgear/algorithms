package com.vkeonline.studyguide;

import com.vkeonline.enthuware.exam816.NIO2Features;
import org.junit.jupiter.api.Test;

import java.io.IOException;

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