package com.vkeonline.lintcode.p1300;

/**
 * LintCode: #1350
 *  1) it's base conversion, 1-26, not (0-25)
 * @author csgear
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder() ;

        while (n > 0) {
            n--;
            sb.append ( (char) ( (n % 26) + 'A'));
            n /= 26;
        }
        return sb.reverse().toString();
    }
}
