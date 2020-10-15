package com.vkeonline.lintcode.p1700;

/**
 * lint code: 1705. Compare Strings II
 *
 * @author csgear
 */
public class CompareStringTwo {
    public int[] compareStringii(String A, String B) {
        // write your code here
        String[] as = A.split(",");
        String[] bs = B.split(",");
        int[] cnt_a = new int[as.length];
        int[] cnt_b = new int[bs.length];

        for (int i = 0; i < as.length; i++)
            cnt_a[i] = count(as[i]);

        for (int i = 0; i < bs.length; i++) {
            cnt_b[i] = count(bs[i]);
        }


        int[] result = new int[bs.length];

        for (int i = 0; i < cnt_b.length; i++) {
            int count = 0;
            for (int j = 0; j < cnt_a.length; j++) {
                if (cnt_a[i] > cnt_b[j]) count++;
            }
            result[i] = count;
        }

        return result;
    }

    private int count(String s) {
        int result = 0;
        char min = 'z';

        for (char c : s.toCharArray()) {
            if (c < min) {
                min = c;
                result = 1;
            } else if (c == min) {
                result++;
            }
        }

        return result;
    }

}
