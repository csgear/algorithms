
// leetcode.com  645. Set Mismatch

#include <vector>
#include <unordered_map>

class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        unordered_map<int, int> m ;
        vector<int> res ;

        int sum = 0, n = nums.size() ;

        for(auto &num: nums)  sum += num ;

        for(auto &num : nums)
        {
            if(m.count(num) == 0) m[num] = 1 ;
            else
            {
                res.push_back(num) ;
                res.push_back( ((n+1) * n) / 2 + num - sum) ;   
            }
        }

        return res ;
    }
};