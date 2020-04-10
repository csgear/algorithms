
//  Leetcode: 477. Total Hamming Distance

#include <vector>

using namespace std;

class Solution
{
  public:
    int totalHammingDistance(vector<int> &nums)
    {
        int ans = 0;

        int mask;
        int zeros, ones;

        for (int i = 0; i < 32; i++)
        {
            mask = 1 << i;

            zeros = ones = 0;

            for (auto n : nums)
            {
                if (n & mask)
                {
                    ones += 1;
                }
                else
                {
                    zeros += 1;
                }
            }

            ans += ones * zeros;
        }

        return ans;
    }
};
