package com.vkeonline.studyguide.z10815;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HttpClientFeatureTest {
    static HttpClientFeature hcf = new HttpClientFeature() ;
    @Test
    void getUrl() {
        hcf.getUrl();
    }
}