package com.vkeonline.lintcode.p800;

/**
 * Lintcode 888. Valid Word Square
 * @author csgear
 */
public class ValidWordSquare {
    public boolean validWordSquare (String[] words) {
        if(words.length != words[0].length()) {
            return false ;
        }
        for(int i = 0 ; i < words.length ; i++) {
            for (int j = 0; j < words[0].length(); j++) {
                if (j >= words.length || i >= words[j].length() || words[i].charAt (j) != words[j].charAt (i)) {
                    return false;
                }
            }
        }
        return true ;
    }
}
