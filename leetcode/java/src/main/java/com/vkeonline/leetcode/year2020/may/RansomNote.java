package com.vkeonline.leetcode.year2020.may;

import java.util.HashMap;
import java.util.Map;

/**
 * @author
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int currentVal = map.getOrDefault(c, 0);
            if (currentVal == 0) {
                return false;
            } else {
                map.put(c, currentVal - 1);
            }
        }
        return true;
    }

    public boolean canConstructArray(String ransomNote, String magazine) {
        // Write your code here
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            // 记录每个字符的个数
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            // 在ransomNote中减去字符的个数并判断是否 < 0
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
