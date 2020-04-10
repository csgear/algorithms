
// leetcode.com 325 Maximum Size Subarray Sum Equals k

class Solution
{
  public:
    vector<int> maxSubArrayLen(vector<int> &nums, int k)
    {
        //key accumulate sum from 0 to index
        //value will be the index
        std::unordered_map<int, int> mp;

        vector<int> v;

        int sum = 0, maxlen = INT_MIN;

        for (int i = 0; i < nums.size(); ++i)
        {
            sum += nums[i] ;
            if (sum == k)
            {
                maxlen = i + 1;
                v = {0, i};
            }

            if (mp.count(sum - k))
            {
                if (i - mp[sum - k] > maxlen)
                {
                    maxlen = i - mp[sum - k];
                    v = { mp[sum - k] + 1, i };
                }
            }

            if (!mp.count(sum))
            {
                mp[sum] = i;
            }
        }

        if (maxlen == INT_MIN)
        {
            v = {-1};
        }
        else
        {
            v = {v[0] + 1, v[1] + 1};
        }

        return v;
    }
};