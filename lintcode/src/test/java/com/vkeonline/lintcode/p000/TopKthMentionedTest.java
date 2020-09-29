package com.vkeonline.lintcode.p000;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopKthMentionedTest {

    @Test
    void topkKeywords() {
        String s = "Best services provided by   anacell, everyone should use anacell" ;
        s.replaceAll("", "") ;
        String[] token = s.split("\\s+") ;
        System.out.println(token.length);
    }
}