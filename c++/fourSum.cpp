
//  leetcode.com : 18. 4Sum

#include <vector>
#include <set>

using namespace std ;

class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<vector<int>> result ;
        
        set<vector<int>> r ;
        
        if(nums.size() < 4)  return result ;
        
        sort(nums.begin(), nums.end()) ;
        
        for(int i = 0 ; i < nums.size() - 3 ; ++i)
        {
            for(int j = i + 1 ; j < nums.size() - 2 ; ++j)
            {
                int k = j + 1 ;
                int l = nums.size() - 1 ;
                
                while(k < l)
                {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l] ;
                    
                    if(sum == target)
                    {
                        r.insert(vector<int>{nums[i], nums[j], nums[k], nums[l]}) ;
                    }
                    
                    if(sum < target) k++ ;
                    else l-- ;
                    
                }
                
            }
        }
        
        std::copy(r.begin(), r.end(), std::back_inserter(result)) ;
        
        return result ;
    }
};
