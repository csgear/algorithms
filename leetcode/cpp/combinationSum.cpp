
// leetcode.com  39. Combination Sum

class Solution
{
  public:
    vector<vector<int>> combinationSum(vector<int> &candidates, int target)
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
            out.push_back(candidates[i]);
            helper(candidates, target - candidates[i], i, out, res);
            out.pop_back();
        }
    }
};
