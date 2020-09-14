package com.vkeonline.lintcode;

import java.util.HashSet;
import java.util.Set;

/**
 * LintCode: 860. Number of Distinct Islands
 * @author csgear
 */
public class NumberDistinctIslands {
    public int numberofDistinctIslands(int[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        Set<String> set = new HashSet<>();
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    StringBuilder sb = new StringBuilder();
                    clearIsland(grid, i, j, sb, "o");
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }

    private void clearIsland(int[][] grid, int i, int j, StringBuilder sb, String direction) {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) return;
        grid[i][j] = 0;
        sb.append(direction);
        clearIsland(grid, i - 1, j, sb, "u");
        clearIsland(grid, i + 1, j, sb, "d");
        clearIsland(grid, i, j - 1, sb, "l");
        clearIsland(grid, i, j + 1, sb, "r");
        sb.append("b");
    }
}
