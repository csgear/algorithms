package com.vkeonline.lintcode;

/**
 * @author csgear
 */
public class RotateString {
    public void rotateString(char[] str, int offset) {
        int n = str.length;
        offset = offset % n;
        StringBuilder sb = new StringBuilder();
        sb.append(str, n - offset, offset);
        sb.append(str, 0, n - offset);
        for (int i = 0; i < n; i++) {
            str[i] = sb.charAt(i);
        }
    }
}
