
// leetcode.com 650. 2 Keys Keyboard

#include <vector>

using namespace std;

class Solution
{
  public:
    int minSteps(int n)
    {
        vector<int> v(n + 1, INT_MAX);

        v[0] = v[1] = 0;

        for (int i = 2; i <= n; ++i)
        {
            for (int j = 1; j <= i; ++j)
            {
                if (i % j == 0)
                    v[i] = min(v[i], v[j] + i / j);
            }
        }

        return v[n];
    }
};