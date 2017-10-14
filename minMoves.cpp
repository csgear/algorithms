
// leetcode.com 453. Minimum Moves to Equal Array Elements

class Solution
{
  public:
    int minMoves(vector<int> &nums)
    {
        int minx = INT_MAX;
        int sum = 0;
        for (int i = 0; i < nums.size(); ++i)
        {
            sum += nums[i];
            minx = min(minx, nums[i]);
        }
        return sum - minx * nums.size();
    }
};