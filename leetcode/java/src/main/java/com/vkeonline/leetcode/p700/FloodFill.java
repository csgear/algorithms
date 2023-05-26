package com.vkeonline.leetcode.p700;

/**
 * simple dfs
 * Leetcode [M]: 733. Flood Fill
 * @author csgear
 */
public class FloodFill {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int oldColor = image[sr][sc];

        dfs(image, sr, sc, oldColor, newColor);

        return image;
    }

    private void dfs(int[][] image, int i, int j, int oldColor, int newColor) {

        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] == newColor)
        {
            return;
        }

        if (image[i][j] == oldColor) {
            image[i][j] = newColor;
            dfs(image, i + 1, j, oldColor, newColor);
            dfs(image, i - 1, j, oldColor, newColor);
            dfs(image, i, j + 1, oldColor, newColor);
            dfs(image, i, j - 1, oldColor, newColor);
        }
    }
}
