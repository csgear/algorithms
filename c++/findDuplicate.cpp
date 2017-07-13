
// 287. Find the Duplicate Number

#include <vector>

using namespace std ;

class Solution {
public:
    int findDuplicate(vector<int>& nums) {
        int middle ;
        
        int low = 1 , high = nums.size() - 1 ;
        
        while(low < high)
        {
            int cnt = 0 ;
            
            middle = low + (high - low) / 2.0 ;
            
            for(int i = 0 ; i < nums.size() ; i++)
            {
                if(nums[i] <= middle)  cnt = cnt + 1 ;
            }
            
            if(cnt > middle)
                high = middle ;
            else
                low = middle + 1 ;
            
        }
        
        return low ;
        
    }
};
