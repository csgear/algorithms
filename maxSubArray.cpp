
// leetcode.com 53. Maximum Subarray 

class Solution {
public:
    int maxSubArraySum(vector<int> nums)
    {
        if(nums.empty())  return 0 ;
        
        int max_so_far = INT_MIN ;
        
        int max_ending_here = 0 ;
        
        for(auto n : nums)
        {
            max_ending_here = max_ending_here + n ;
            
            if(max_so_far < max_ending_here)  max_so_far = max_ending_here ;
            
            if(max_ending_here < 0)  max_ending_here = 0 ;
        }
        
        return max_so_far ;
    }

};