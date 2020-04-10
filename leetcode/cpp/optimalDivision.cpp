
// leetcode.com  553. Optimal Division

#include <vector>
#include <string>

class Solution {
public:
    string optimalDivision(vector<int>& nums) {
        string res = "" ;

        if(nums.empty()) return res ;

        if(nums.size() == 1) {
            res = to_string(nums[0]) ;
        } 
        else if(nums.size() == 2) 
        {
            res = to_string(nums[0]) + "/" + to_string(nums[1]) ;
        }
        else 
        {
            res = to_string(nums[0]) + "/(" + to_string(nums[1]) ;

            for(int i = 2 ; i < nums.size() ; i++)
                res += "/" + to_string(nums[i]) ;
            
            res += ")" ;
        }

        return res ;
    }
};