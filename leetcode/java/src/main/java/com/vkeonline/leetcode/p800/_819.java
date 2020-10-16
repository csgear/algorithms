package com.vkeonline.leetcode.p800;

import java.util.*;

public class _819 {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"ball"};

        Solution solution = new _819().new Solution();

        System.out.println(solution.mostCommonWord(paragraph, banned));
    }

    class Solution {
        public String mostCommonWord(String paragraph, String[] banned) {
            Set<String> set = new HashSet<>(Arrays.asList(banned));
            Map<String, Integer> map = new HashMap<>();

            paragraph = processing(paragraph);

            String[] words = paragraph.split("\\s+");
            for (String word : words) {
                if (! set.contains(word))
                    map.put(word, map.getOrDefault(word, 0) + 1);
            }

            String res = "";
            int frequent = 0;

            for (Map.Entry<String, Integer> ele : map.entrySet()){
                String key = ele.getKey();
                if (set.contains(key)){
                    continue;
                }

                if (ele.getValue() > frequent){
                    res = key;
                    frequent = ele.getValue();
                }

                if (ele.getValue() == frequent && res.compareTo(key) > 0){
                    res = key;
                    frequent = ele.getValue();
                }
            }
            return res;

        }

        private String processing(String s){
            char[] array = s.toCharArray();
            for (int i = 0; i < array.length; i++){
                char ch = array[i];
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                    array[i] = Character.toLowerCase(ch);
                } else {
                    array[i] = ' ';
                }
            }
            return String.valueOf(array);
        }

        private boolean contains(String s, String word) {
            String[] words = s.replaceAll("\\p{Punct}", " ").trim().toLowerCase().split("\\s+") ;

            return Arrays.asList(words).contains(word) ;
        }
     }
}
