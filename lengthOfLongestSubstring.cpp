
// letcode.com 3. Longest Substring Without Repeating Characters

class Solution
{
  public:
    int lengthOfLongestSubstring(string s)
    {
        vector<int> m(256, -1);
        int res = 0, left = INT_MIN ;
        for (int i = 0; i < s.size(); ++i)
        {
            left = max(left, m[s[i]]);
            m[s[i]] = i;
            res = max(res, i - left);
        }
        return res;
    }
};