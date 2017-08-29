
// leetcode.com 518. Coin Change 2

class Solution
{
  public:
    int change(int amount, vector<int> &coins)
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