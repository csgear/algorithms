
// leetcode.com 646. Maximum Length of Pair Chain

#include <vector>

class Solution {
public:
    // greedy algorithm like task schedule problem
    int findLongestChain(vector<vector<int>>& pairs) {
        int res = 0 ;
        auto cmp = [](vector<int> &v1, vector<int> &v2)
        {
            return v1[1] < v2[1] ;
        } 

        sort(pairs.begin(), pairs.end(), cmp) ;

        int last = INT_MIN ;

        for(auto& pair: pairs)
        {
            if(pair[0] > last)
            {
                last = pair[1] ;
                ++res ;
            }
        }

        return res ;
    }
};