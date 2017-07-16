
//leetcode.com : 494. Target Sum

#include <vector>

using namespace std ;

class Solution {
public:
    int findTargetSumWays(vector<int>& nums, int S) {
        int result = 0 ;
        
        helper(nums, S, 0, result) ;
        
        return result ;
    }
    
    void helper(vector<int>& nums, int target, int curr, int &res)
    {
        if(curr == nums.size()) 
        {
            if(target == 0)  ++res ;
            return ;
        }
        
        helper(nums, target + nums[curr], curr + 1, res) ;
        helper(nums, target - nums[curr], curr + 1, res) ;
    }
};