package com.vkeonline.lintcode.p1400;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csgear
 * Lint code: 1401. Twitch Words
 */
public class TwitchWords {
    public int[][] twitchWords(String str) {
        if(str == null || str.length() == 0) {
            return new int[0][0] ;
        }

        List<int[]> list = new ArrayList<>() ;

        for(int i = 0 ; i < str.length(); i++) {
            int start = i ;
            while(i + 1 < str.length() && str.charAt(i+1) == str.charAt(start)) {
                i++ ;
            }

            if(i - start + 1 >= 3) {
                list.add(new int[] {start, i}) ;
            }
        }

        int[][] result = new int[list.size()][2] ;

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i) ;
        }

        return result ;
    }
}
