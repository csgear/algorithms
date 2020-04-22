package com.vkeonline.studyguide;

import org.junit.jupiter.api.Test;

class HttpClientFeatureTest {
    static HttpClientFeature hcf = new HttpClientFeature() ;
    @Test
    void getUrl() {
        hcf.getUrl();
    }
}