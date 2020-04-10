//
//  leetcode.com： 15. 3Sum
//

#include <vector>

using namespace std;

class Solution
{
  public:
    vector<vector<int>> threeSum(vector<int> &nums)
    {
        vector<vector<int>> answers;

        if (nums.size() < 3)
            return answers;

        sort(nums.begin(), nums.end());

        int ans = 0;

        for (int i = 0; i < nums.size() - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int j = i + 1;

            int k = nums.size() - 1;

            while (j < k)
            {
                ans = nums[i] + nums[j] + nums[k];

                if (ans == 0)
                {
                    answers.push_back({nums[i], nums[j], nums[k]});
                    ++j;

                    while (j < nums.size() && nums[j] == nums[j - 1])
                        ++j;
                    --k;
                    while (k >= 0 && nums[k] == nums[k + 1])
                        --k;
                }

                else if (ans > 0)
                    --k;

                else
                    ++j;
            }
        }

        return answers;
    }
};
