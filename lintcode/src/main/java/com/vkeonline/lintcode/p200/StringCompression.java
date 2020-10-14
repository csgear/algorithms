package com.vkeonline.lintcode.p200;

/**
 * Lint code: 213. String Compression  [EASY]
 * @author csgear
 */
public class StringCompression {
    public String compress(String originalString) {
        if(originalString == null || originalString.length() == 0) {
            return "" ;
        }

        StringBuilder sb = new StringBuilder(); ;
        char[] letters = originalString.toCharArray() ;
        char curr = letters[0] ;
        int count = 1 ;

        for (int i = 1; i < letters.length ; i++) {
            if(letters[i] == curr) {
                count++ ;
            }
            else {
                sb.append(curr) ;
                sb.append(count) ;
                count = 1 ;
                curr = letters[i] ;
            }
        }

        sb.append(curr) ;
        sb.append(count) ;

        return sb.length() < originalString.length() ? sb.toString(): originalString ;
    }
}
