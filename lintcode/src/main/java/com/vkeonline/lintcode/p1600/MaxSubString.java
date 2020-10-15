package com.vkeonline.lintcode.p1600;

import java.util.ArrayList;
import java.util.List;

/**
 * Lintcode: 1648. max substring
 * @author csgear
 */
public class MaxSubString {
    public String maxSubstring(String s) {
        List<Integer> pos = new ArrayList<>() ;

        char maxChar = 'a' ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) > maxChar) {
                pos.clear();
                pos.add(i) ;
                maxChar = s.charAt(i) ;
            }
            else if(s.charAt(i) == maxChar){
                pos.add(i) ;
            }
        }

        if(pos.size() == 1)  {
            return s.substring(pos.get(0)) ;
        }

        int prePos = pos.get(0) ;
        for(int i = 1 ; i < pos.size() ; i++) {
            int currPos = pos.get(i) ;
            for (int j = 0; j < s.length() - currPos; j++) {
                if(s.charAt(currPos + j) > s.charAt(prePos + j)) {
                    prePos = currPos ;
                    break ;
                }
                if(s.charAt(currPos + j) < s.charAt(prePos + j)) {
                    break ;
                }
            }
        }

        return s.substring(prePos) ;
    }

}
