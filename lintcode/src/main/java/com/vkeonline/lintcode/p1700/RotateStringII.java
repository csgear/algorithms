package com.vkeonline.lintcode.p1700;

/**
 * LintCode 1790. Rotate String II
 * @author csgear
 */
public class RotateStringII {

    /**
     * @param str:   An array of char
     * @param left:  a left offset
     * @param right: a right offset
     * @return: return a rotate string
     */
    public String RotateString2(String str, int left, int right) {
        if (str.length() == 0) return str;
        int n = str.length();
        left = left % n;
        right = right % n;

        StringBuffer sb = new StringBuffer();
        sb.append(str.substring(left));
        sb.append(str, 0, left);
        str = sb.toString();
        sb.delete(0, sb.length());
        sb.append(str.substring(n - right));
        sb.append(str, 0, n - right);
        return sb.toString();
    }
}

