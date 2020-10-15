package com.vkeonline.lintcode.p1100;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * LintCode: 1186. Encode and Decode TinyURL
 * @author csgear
 */
public class TinyUrl {
    Map<String, String> longToShort = new HashMap<>();
    Map<String, String> shortToLong = new HashMap<>();


    private String generateShortUrl(){
        Random rand = new Random();
        int randInt = rand.nextInt();
        //rand to 6  chars
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 6; i++){
            sb.append((char)(randInt % 62));
            randInt /= 62;
        }
        return sb.toString();

    }
    //assume long have a-zA-Z0-9 total 62 chars
    public String encode(String longUrl) {
        if(longToShort.containsKey(longUrl)){
            return longToShort.get(longUrl);
        }
        String res = generateShortUrl();
        while(shortToLong.containsKey(res)){
            res = generateShortUrl();
        }
        shortToLong.put(res, longUrl);
        longToShort.put(longUrl, res);
        return res;
    }


    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}
