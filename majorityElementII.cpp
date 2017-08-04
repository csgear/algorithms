
// leetcode.com : 229. Majority Element II
#include <vector>

using namespace std ;

class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        int n1 = 0, n2 = 0;
        int c1 = 0, c2 = 0 ;

        for(auto num : nums)
        {
            if(num == n1) n1++ ;
            else if(num == n2) n2++ ;
            else if (c1 == 0) {
                c1 = 1 ; n1 = mum ;
            }
            else if(c2 == 0)
            {
                c2 = 1 ; n2 = num ;
            }
            else 
            {
                --c1 ; --c2 ;
            }
        }

        c1 = c2 = 0 ;

        for (auto& num : nums) {
            if (num == n1) ++c1;
            else if (num == n2) ++c2;
        }

        vector<int> res ;

        if(c1 > nums.size() / 3)  res.push_back(n1) ;
        if(c2 > nums.size() / 3)  res.push_back(n2) ;

        return res ;
    }
};