
// leetcode.com 213. House Robber II

class Solution
{
  public:
    int rob(vector<int> &nums)
    {
        if (nums.size() == 0)
            return 0;

        if (nums.size() == 1)
            return nums[0];

        return max(helper(nums, 0, nums.size() - 1), helper(nums, 1, nums.size()));
    }

    int helper(vector<int> &nums, int left, int right)
    {
        if (right - left <= 1)
            return nums[left];

        vector<int> v(right, 0);

        v[left] = nums[left];
        v[left + 1] = max(nums[left], nums[left + 1]);

        for (int i = left + 2; i < right; ++i)
        {
            v[i] = max(nums[i] + v[i - 2], v[i - 1]);
        }

        return v[right - 1];
    }
};