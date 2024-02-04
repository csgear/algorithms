
// leetcode.com 518. Coin Change 2

#include "vector"

class Solution
{
  public:
    static int change(int amount, std::vector<int> &coins)
    {
        vector<int> v(amount + 1);

        v[0] = 1;

        for (const int &num : coins)
        {
            for (int i = num; i <= amount; i++)
                v[i] += v[i - num];
        }

        return v[amount];
    }
};