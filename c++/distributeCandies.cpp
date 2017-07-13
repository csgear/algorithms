
//  leetcode.com 575. Distribute Candies

#include <set>
#include <vector>
#include <algorithm>

using namespace std ;

class Solution {
public:
    int distributeCandies(vector<int>& candies) {
        set<int> s(candies.begin(), candies.end()) ;
        
        return min(candies.size() /2, s.size()) ;
    }
};
