package com.vkeonline.leetcode.p900;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _937 {
    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"} ;

        Solution solution = new _937().new Solution() ;

        Arrays.stream(solution.reorderLogFiles(logs)).forEach(System.out::println);

    }
    class Solution {
        public String[] reorderLogFiles(String[] logs) {
            int n = logs.length ;

            String[] result = new String[n] ;

            List<String> letterLogs = new ArrayList<>() ;

            int cnt = n - 1 ;
            for(int i = n - 1 ; i >= 0 ; i--) {
                int index = logs[i].indexOf(' ') ;
                String sub = logs[i].substring(index + 1).trim() ;

                if(sub.charAt(0) >= '0' && sub.charAt(0) <= '9') {
                    result[cnt--] = logs[i] ;
                }
                else {
                    letterLogs.add(logs[i]) ;
                }
            }

            assert(cnt == letterLogs.size()) ;

            letterLogs.sort((s1, s2) -> {
                int index1 = s1.indexOf(' ');
                int index2 = s2.indexOf(' ');
                String id1 = s1.substring(0, index1);
                String id2 = s2.substring(0, index2);
                String body1 = s1.substring(index1 + 1);
                String body2 = s2.substring(index2 + 1);
                if (body1.compareTo(body2) == 0) {
                    return s1.compareTo(s2);
                } else {
                    return body1.compareTo(body2);
                }
            });

            for(int i = 0 ; i < letterLogs.size() ; i++) {
                result[i] = letterLogs.get(i)    ;
            }

            return result ;

        }
    }
}
