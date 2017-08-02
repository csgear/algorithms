
// leetcode.com 31. Next Permutation

class Solution
{
  public:
    void nextPermutation(vector<int> &nums)
    {
        // std::next_permutation(nums.begin(), nums.end()) ;
        // 在当前序列中，从尾端往前寻找两个相邻元素，前一个记为*i，后一个记为*ii，
        // 并且满足*i < *ii。然后再从尾端寻找另一个元素*j，如果满足*i < *j，
        // 即将第i个元素与第j个元素对调，并将第ii个元素之后（包括ii）的所有元素颠倒排序，
        // 即求出下一个序列了。
        int i, j, n = nums.size();

        for (i = n - 2; i >= 0; --i)
        {
            if (nums[i + 1] > nums[i])
            {
                for (j = n - 1; j > i; --j)
                {
                    if (nums[j] > nums[i])
                        break;
                }

                swap(nums[i], nums[j]);

                reverse(nums.begin() + i + 1, nums.end());

                return;
            }
        }

        reverse(nums.begin(), nums.end());

        return;
    }
};