
// leetcode.com : 49. Group Anagrams

#include <string>
#include <vector>
#include <unordered_map>
#include <algorithm>

using namespace std;

class Solution
{
  public:
    vector<vector<string>> groupAnagrams(vector<string> &strs)
    {
        vector<vector<string>> result;

        unordered_map<string, vector<string>> m;

        for (auto s : strs)
        {
            string t = s;

            sort(t.begin(), t.end());

            m[t].push_back(s);
        }

        for (auto s : m)
        {
            result.push_back(s.second);
        }

        return result;
    }
};