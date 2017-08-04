
// leetcode.com : 42. Trapping Rain Water

#include <vector>

using namespace std ;


class Solution {
public:
    int trap(vector<int>& height) {
        int left = 0, right = height.size() - 1 ;
        int level = 0, result = 0 ;

        int low ;

        while(left < right)
        {
            if(height[left] < height[right]) 
            {
                low = height[left++] ;
            }
            else 
            {
                low = height[right--] ;
            }

            level = max(level, low) ;

            result = result + level - low ;
        }  

        return result ;
    }
};