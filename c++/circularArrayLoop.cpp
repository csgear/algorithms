//
//  circularArrayLoop.cpp
//  codefights


#include <vector>

using namespace std ;

class Solution {
public:
    
    bool  circularArrayLoop(vector<int>& nums)
    {
        int length = nums.size() ;
        
        vector<bool> pos(length, 0) ;
        
        for(int i = 0 ; i < length ; i++)
        {
            if(pos[i] && dfs(pos, i, length, 0))
            {
                return true ;
            }
        }
        return false ;
    }
    
    bool dfs(vector<bool>& pos, int start, int length, int count)
    {
        int newIndex = (start + numeric_limits<<#class _Tp#>>)
    }
    
} ;
