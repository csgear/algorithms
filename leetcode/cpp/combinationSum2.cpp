


// leetcode.com  40. Combination Sum II

class Solution
{
  public:
    vector<vector<int>> combinationSum2(vector<int> &candidates, int target)
    {
        if (candidates.empty())
            return {};

        vector<vector<int>> res;
        vector<int> out;

        sort(candidates.begin(), candidates.end());

        helper(candidates, target, 0, out, res);

        return res;
    }

    void helper(vector<int> &candidates, int target, int level,
                vector<int> &out, vector<vector<int>> &res)
    {
        if (target < 0)
            return;

        if (target == 0)
        {
            res.push_back(out);
            return;
        }

        for (int i = level; i < candidates.size(); i++)
        {
            if (i > level && candidates[i] == candidates[i - 1]) continue;

            out.push_back(candidates[i]);

            helper(candidates, target - candidates[i], i + 1, out, res);

            out.pop_back();
        }
    }
};
