
// leetcode.com 198. House Robber

#include <vector>

using namespace std;

class Solution
{
  public:
    int rob(vector<int> &nums)
    {

        if (nums.size() == 0)
            return 0;

        if (nums.size() == 1)
            return nums[0];

        vector<int> v(nums.size());

        v[0] = nums[0];
        v[1] = max(nums[0], nums[1]);

        for (int i = 2; i < nums.size(); ++i)
        {
            v[i] = max(nums[i] + v[i - 2], v[i - 1]);
        }

        return v[nums.size() - 1];
    }
};