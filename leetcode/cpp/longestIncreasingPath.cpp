
// leetcode.com 329. Longest Increasing Path in a Matrix

class Solution
{
  public:
    int longestIncreasingPath(vector<vector<int>> &matrix)
    {
        if (matrix.empty() || matrix[0].empty())
            return 0;

        int res = 1, m = matrix.size(), n = matrix[0].size();
        vector<vector<int>> path(m, vector<int>(n, 0));

        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                res = max(res, helper(matrix, path, i, j));
            }
        }

        return res;
    }

    int helper(vector<vector<int>> &matrix, vector<vector<int>> &path, int i, int j)
    {
        if (path[i][j])
            return path[i][j];

        vector<vector<int>> dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int mx = 1, m = matrix.size(), n = matrix[0].size();

        for (auto &dir : dirs)
        {
            int x = i + dir[0], y = j + dir[1];

            if (x < 0 || x >= m || y < 0 || y >= n || matrix[x][y] <= matrix[i][j])
                continue;

            int len = 1 + helper(matrix, path, x, y);

            mx = max(len, mx);
        }

        path[i][j] = mx;

        return path[i][j];
    }
};