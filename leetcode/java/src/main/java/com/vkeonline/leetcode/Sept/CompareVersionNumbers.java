package com.vkeonline.leetcode.Sept;

/**
 * @author csgear
 */
public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        String[] versions1 = version1.split("[.]");
        String[] versions2 = version2.split("[.]");

        int i = 0, j = 0;

        while (i < versions1.length && j < versions2.length) {
            int v1 = Integer.parseInt(versions1[i]);
            int v2 = Integer.parseInt(versions2[j]);

            if (v1 != v2) {
                return v1 > v2 ? 1 : -1;
            }
            i++;
            j++;
        }

        while (i < versions1.length) {
            int v1 = Integer.parseInt(versions1[i]);
            if (v1 != 0) {
                return 1;
            }
            i++;
        }

        while (j < versions2.length) {
            int v2 = Integer.parseInt(versions2[j]);
            if (v2 != 0) {
                return -1;
            }
            j++;
        }

        return 0 ;
    }
}
