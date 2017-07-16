
#include <vector>
#include <unordered_map>

using namespace std ;

class Solution {
public:
    double findMaxAverage(vector<int>& nums, int k) {
        double mid = 0 ;
        
        double min_val = INT_MAX ;
        double max_val = INT_MIN ;
        
        for(int i = 0 ; i < nums.size() ; i++)
        {
            min_val = std::min(nums[i], (int) min_val) ;
            max_val = std::max(nums[i], (int) max_val) ;
        }
        
        double error = INT_MAX ;
        
        double prev_mid = max_val ;
        
        while(error > 0.00001)
        {
            mid = (min_val + max_val) * 0.5 ;
            
            if(check(nums, mid, k))
            {
                min_val = mid ;
            }
            else
            {
                max_val = mid ;
            }
            
            error = abs(prev_mid - mid) ;
            
            prev_mid = mid ;
        }
        
        return min_val ;
    }
    
    // check if a subarray such as the sum of all elements is greater than zero
    bool check(vector<int>& nums, double mid, int k)
    {
        double sum = 0, prev = 0, min_sum = 0.0 ;
        
        for(int i = 0 ; i < k ; i++)
        {
            sum = sum + nums[i] - mid ;
        }
        
        if(sum >= 0)  return true ;
        
        for(int i = k ; i < nums.size() ; i++)
        {
            sum = sum + nums[i] - mid ;
            
            prev = prev + nums[i - k] - mid ;
            
            min_sum = std::min(prev, min_sum) ;
            
            if(sum - min_sum >= 0)
                return true ;
        }
        
        return false ;
    }
};
