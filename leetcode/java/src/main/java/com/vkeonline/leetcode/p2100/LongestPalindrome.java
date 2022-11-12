

package com.vkeonline.leetcode.p2100;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode [M]: 2131. Longest Palindrome by Concatenating Two Letter Words
 * @author csgear
 */
public class LongestPalindrome {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.compute(word, (k, v) -> (v == null) ? 1 : v+1) ;
        }

        int answer = 0;
        boolean central = false;

        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String word = entry.getKey();
            int countOfTheWord = entry.getValue();
            if (word.charAt(0) == word.charAt(1)) {
                if (countOfTheWord % 2 == 0) {
                    answer += countOfTheWord;
                } else {
                    answer += countOfTheWord - 1;
                    central = true;
                }
            } else if (word.charAt(0) < word.charAt(1)) {
                String reversedWord = "" + word.charAt(1) + word.charAt(0);
                if (count.containsKey(reversedWord)) {
                    answer += 2 * Math.min(countOfTheWord, count.get(reversedWord));
                }
            }
        }
        if (central) {
            answer++;
        }

        return 2 * answer ;
    }
}
