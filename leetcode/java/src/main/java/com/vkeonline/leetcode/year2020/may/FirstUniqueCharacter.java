package com.vkeonline.leetcode.year2020.may;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] cnt_arr = new int[26];
        for(int i = 0; i < s.length(); i++){
            cnt_arr[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(cnt_arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
