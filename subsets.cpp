
// leetcode.com: 78. Subsets

#include <vector>
using namespace std;

class Solution
{
  public:
    vector<vector<int>> subsets(vector<int> &nums)
    {
        vector<vector<int>> result;

        vector<int> v = {};

        result.push_back(v);

        int last = nums[0], lastsize;

        for (int i = 0; i < nums.size(); i++)
        {
            if (last != nums[i])
            {
                last = nums[i];
                lastsize = result.size();
            }

            int newsize = result.size();

            for (int j = newsize - lastsize; j < newsize; j++)
            {
                vector<int> vs = result[j];
                vs.push_back(nums[i]);
                result.push_back(vs);
            }
        }

        return result;
    }
};
