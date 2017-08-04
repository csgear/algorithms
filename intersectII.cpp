
// leetcode.com 350. Intersection of Two Arrays II

#include <vector>
#include <unordered_map>

class Solution
{
  public:
    vector<int> intersect(vector<int> &nums1, vector<int> &nums2)
    {
        unordered_map<int, int> mp;
        vector<int> v;

        for (auto &num : nums1)
            mp[num]++;

        for (auto &num : nums2)
        {
            if (mp[num]-- > 0)
            {
                v.push_back(num);
            }
        }

        return v;
    }
};