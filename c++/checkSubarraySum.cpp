
// leetcode.com : 523. Continuous Subarray Sum

#include <vector>

using namespace std ;

class Solution {
public:
    bool checkSubarraySum(vector<int>& nums, int k) {
        
        int sum = 0 ;
        
        for(int i = 0 ; i < nums.size() ; ++i)
        {
            sum = nums[i] ;
            
            for(int j = i + 1 ; j < nums.size() ; ++j)
            {
                sum = sum + nums[j] ;
                
                if(sum == k) return true ;
                
                if(k != 0 && sum % k == 0) return true ;
            }
        }
        
        return false ;
    }
};