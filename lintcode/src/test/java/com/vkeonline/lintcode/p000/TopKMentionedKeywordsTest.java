package com.vkeonline.lintcode.p000;

import com.vkeonline.lintcode.TopKMentionedKeywords;
import org.junit.jupiter.api.Test;

import java.util.List;

class TopKMentionedKeywordsTest {

    @Test
    void testTopKMentionedKeywords() {
        TopKMentionedKeywords top = new TopKMentionedKeywords() ;
        int k = 2 ;
        String[] keywords = {"anacell", "betacellular", "cetracular", "deltacellular", "eurocell"} ;
        String[] reviews = {
                "I love anacell Best services; Best services provided by anacell",
                "betacellular has great services",
                "deltacellular provides much better services than betacellular",
                "cetracular is worse than anacell",
                "Betacellular is better than deltacellular.",
        } ;
        List<String> result = top.TopkKeywords(k, keywords, reviews) ;
        System.out.println(result.toString());
    }

}