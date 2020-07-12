package com.vkeonline.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 13
 * leetcode: 13 roman to integer
 */
public class RomanToInt {
    public int romanToInt(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = romanValues.get(s.charAt(s.length() - 1));

        for (int k = s.length() - 2; k >= 0; k--) {
            if (romanValues.get(s.charAt(k)) >= romanValues.get(s.charAt(k + 1))) {
                result = result + romanValues.get(s.charAt(k));
            } else {
                result = result - romanValues.get(s.charAt(k));
            }
        }

        return result;
    }
}

