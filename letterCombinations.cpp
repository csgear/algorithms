
// leetcode.com 17. Letter Combinations of a Phone Number

class Solution
{
  public:
    vector<string> letterCombinations(string digits)
    {
        vector<string> res;

        if (digits.empty())
            return res;

        vector<string> dict = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        string out;

        helper(res, dict, digits, 0, out);

        return res;
    }

    void helper(vector<string> &res, vector<string> &dict, string &digits, int level, string &out)
    {
        if (level == digits.size())
        {
            res.push_back(out);
            return;
        }

        string mp = dict[digits[level] - '2'];

        for (int i = 0; i < mp.size(); ++i)
        {
            out.push_back(mp[i]);
            helper(res, dict, digits, level + 1, out);
            out.pop_back();
        }
    }
};
