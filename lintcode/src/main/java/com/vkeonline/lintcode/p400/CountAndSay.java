package com.vkeonline.lintcode.p400;

/**
 * lint code: 420. Count and Say
 * @author csgear
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String str = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char [] oldChars = str.toCharArray();

            for (int i = 0; i < oldChars.length; i++) {
                int count = 1;
                while ((i+1) < oldChars.length && oldChars[i] == oldChars[i+1]) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count)).append(String.valueOf(oldChars[i]));
            }
            str = sb.toString();
        }

        return str;
    }
}
