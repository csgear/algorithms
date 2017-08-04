
// leetcode.com: 78. Subsets

#include <vector>
#include <algorithm>

using namespace std ;

class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> result ;
        
        vector<int> v = {} ;
        
        result.push_back(v) ;
        
        int last = INT_MAX, lastsize = 0 ;
        
        sort(nums.begin(), nums.end()) ;
        
        for(int i = 0 ; i < nums.size() ; i++)
        {
            int start = 0 ;
            
            if(last != nums[i])
            {
                last = nums[i] ;
                lastsize = result.size() ;
                start = 0 ;
            }
            else
            {
                start = result.size() - lastsize ;
            }
            
            int end = result.size() ;
            
            for(int j = start ; j < end ; j++)
            {
                vector<int> vs = result[j] ;
                vs.push_back(nums[i]) ;
                result.push_back(vs) ;
            }
            
        }
        
        return result ;
    }

};
