
//  leetcode.com : 392. Is Subsequence

#include <string>

using namespace std;

class Solution
{
  public:
    bool isSubsequence(string s, string t)
    {
        int m = s.length();
        int n = t.length();

        int i = 0;
        int j = 0;

        while (i < m && j < n)
        {
            if (s[i] == t[j])
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }

        if (i == m)
            return true;

        return false;
    }
};
