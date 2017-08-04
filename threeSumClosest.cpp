//
//  leetcode.com : 16. 3Sum Closest

#include <vector>
#include <cstdlib>

using namespace std ;

class Solution {
public:
    int threeSumClosest(vector<int>& nums, int target) {
        int result = INT_MAX, diff = INT_MAX ;
        
        sort(nums.begin(),nums.end()) ;
        
        for(int i = 0 ; i < nums.size() - 2 ; i++)
        {
            int j = i + 1 ;
            int k = nums.size() - 1 ;
            
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k] ;
                
                if(abs(sum - target) < diff)
                {
                    diff = abs(sum-target) ;
                    result = sum ;
                }
                
                if(sum < target) j++ ;
                else k-- ;
            }
            
            
         }
        
        return result ;
    }
};
