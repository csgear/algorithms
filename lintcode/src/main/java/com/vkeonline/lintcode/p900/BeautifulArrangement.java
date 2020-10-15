package com.vkeonline.lintcode.p900;

/**
 * lint code: 990. Beautiful Arrangement
 *
 * @author csgear
 */
public class BeautifulArrangement {
    public int countArrangement(int N) {
        boolean[] visited = new boolean[N + 1];
        return dfs(visited, 1);
    }

    private int dfs(boolean[] visited, int index) {
        if (index == visited.length) {
            return 1;
        }

        int result = 0;

        for (int i = 1; i < visited.length; i++) {
            if (visited[i] == false && (i % index == 0 || index % i == 0)) {
                visited[i] = true;
                result += dfs(visited, index + 1);
                visited[i] = false;
            }
        }
        return result;
    }
}
