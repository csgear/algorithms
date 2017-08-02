
// leetcode.com 47. Permutations II

#include <vector>

using namespace std ;

class Solution {
public:
    void helper(vector<vector<int>> &res, vector<int> &nums, int start, int end)
    {
        if(start == end)
        {
            res.push_back(nums) ;
        }
        
        for(int i = start ; i <= end ; i++)
        {
            // if nums[i] equals any of previous elements 
            bool flag = false ;
            
            for(int k = start ; k < i ; k++)
            {
                if(nums[i] == nums[k])
                {
                    flag = true ;
                    break ;
                }
            }
            
            if(flag) continue ;
            
            swap(nums[start], nums[i]) ;
            
            helper(res, nums, start + 1, end) ;
            
            swap(nums[start], nums[i]) ;
        }
    }


    vector<vector<int>> permuteUnique(vector<int>& nums) {
        
        vector<vector<int>> result ;
        
        sort(nums.begin(), nums.end()) ;
        
        helper(result, nums, 0, nums.size() - 1) ;
        
        return result ;
    }
};