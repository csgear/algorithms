//
// leetcode.com 349. Intersection of Two Arraysintersection.cpp
// 

#include <vector>
#include <set>
#include <unordered_map>

using namespace std;

class Solution
{
  public:
    vector<int> intersection(vector<int> &nums1, vector<int> &nums2)
    {
        unordered_map<int, int> mp;
        vector<int> v;

        for (auto &num : nums1)
            mp[num]++;

        for (auto &num : nums2)
        {
            if (mp[num] > 0)
            {
                v.push_back(num);
                mp.erase(num);
            }
        }

        return v;
    }

    vector<int> intersectionSolUsingSet(vector<int> &nums1, vector<int> &nums2)
    {
        set<int> s(nums1.begin(), nums1.end()), answer;

        for (auto &num : nums2)
        {
            if (s.count(num))
            {
                answer.insert(num);
            }
        }
        return vector<int>(answer.begin(), answer.end());
    }
};
