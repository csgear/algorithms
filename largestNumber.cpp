
// leetcode.com 179. Largest Number


#include <vector>
#include <algorithm>
#include <string>

using namespace std ;

class Solution {
public:
    string largestNumber(vector<int>& nums) {

    	sort(nums.begin(), nums.end(), [](int a, int b) {
    		return to_string(a) + to_string(b) > to_string(b) + to_string(a) ;
    	}) ; 

    	string res = "" ;

    	for(int i = 0 ; i < nums.size() ; ++i)
    	{
    		res += to_string(nums[i]) ;
    	}

    	return res[0] == '0' ? "0" : res ;
        
    }
};