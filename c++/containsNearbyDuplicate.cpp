//
//  containsNearbyDuplicate.cpp
//  codefights
//
//  LeetCode 219. Contains Duplicate II
//

#include <map>
#include <unordered_map>
#include <vector>

using namespace std;

class Solution
{
  public:
    bool containsNearbyDuplicate(vector<int> &nums, int k)
    {
        unordered_map<int, int> m;

        int diff = 0;

        for (int i = 0; i < nums.size(); i++)
        {
            if (m.find(nums[i]) != m.end())
            {
                diff = i - m[nums[i]];

                if (diff <= k)
                    return true;
            }

            m[nums[i]] = i;
        }

        return false;
    }
};
