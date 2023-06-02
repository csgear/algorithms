package com.vkeonline.leetcode.p800;

/**
 * Leetcode [E]: 832. Flipping an Image
 * @author csgear
 */
public class FlipImage {
    public int[][] flipAndInvertImage(int[][] images) {
        int col = images[0].length ;
        for(int[] row : images) {
            for (int i = 0; i < (col + 1) / 2; i++) {
                int tmp = row[i] ^ 1 ;
                row[i] = row[col - i - 1] ^ 1 ;
                row[col - i - 1] = tmp ;
            }
        }

        return images ;
    }
}
