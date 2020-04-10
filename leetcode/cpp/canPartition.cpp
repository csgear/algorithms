
// leetcode.com 416. Partition Equal Subset Sum

#include <set>

using namespace std;

class Solution
{
  public:
    bool canPartition(vector<int> &nums)
    {
        set<int> nset;

        int sums = accumulate(nums.begin(), nums.end(), 0);

        // if sums is odd, return false 
        if (sums % 2)
            return false;

        nset.insert(0);

        // from 0, add num to set 
        for (auto &num : nums)
        {
            set<int> nsetc = nset;
            for (auto &m : nsetc)
                nset.insert(num + m);
        }

        return nset.count(sums / 2) > 0;
    }
};