
// leetcode.com 521. Longest Uncommon Subsequence I

#include <string>
#include <algorithm>

using namespace std;

class Solution
{
  public:
    int findLUSlength(string a, string b)
    {
        if (a == b)
            return -1;
        else
            return max(a.size(), b.size());
    }
};