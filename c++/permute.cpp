
// leetcode.com :  46. Permutations

#include <vector>
#include <algorithm>

using namespace std ;

class Solution {
public:
    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> result ;
        
        helper(result, nums, 0, nums.size() - 1)  ;
        
        return result ;
    }
    
    void helper(vector<vector<int>>&res, vector<int> &nums, int l, int r){
        if(l == r)
        {
            res.push_back(nums) ;
        }
        
        for(int i = l ; i <= r ; i++)
        {
            swap(nums[l], nums[i]) ;
            helper(res, nums, l + 1, r) ;
            swap(nums[l], nums[i]) ;
        }
    }
};