package com.vkeonline.leetcode.p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Leetcode [M]: 17. Letter Combinations of a Phone Number
 *
 * @author csgear
 */
public class LetterCombinationsPhoneNumber {
    private final Map<Character, String> possibleLetters = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl", '6', "mno",
            '7', "pqrs", '8', "tuv", '9', "wxyz");

    private final List<String> result = new ArrayList<>();


    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) {
            return result;
        }

        backtracking(digits, 0, new StringBuilder());
        return result;
    }

    private void backtracking(String digits, int index, StringBuilder current) {
        if (index == digits.length()) {
            result.add(current.toString());
            return;
        }

        String letters = this.possibleLetters.get(digits.charAt(index));

        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtracking(digits, index + 1, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
