//
//  findMaxForm.cpp
//  codefights
//
//  Created by YANGXIAOJUN on 2017/1/3.
//  Copyright © 2017年 YANGXIAOJUN. All rights reserved.
//  Leetcode: 474. Ones and Zeroes

#include <string>
#include <vector>

using namespace std ;

class Solution {
public:
    int findMaxForm(vector<string>& strs, int m, int n)
    {
        vector<vector<int>> dp(m+1, vector<int>(n+1, 0)) ;
        
        int ones, zeros ;
        
        for(auto& s: strs)
        {
            ones = zeros = 0 ;
            
            for(auto c : s)
            {
                if( c == '0')
                {
                    zeros += 1 ;
                }
                else if(c == '1')
                {
                    ones += 1 ;
                }
            }
            
            for (int i = m; i >= zeros; i--)
            {
                for (int j = n; j >= ones; j--)
                {
                    dp[i][j] = max(dp[i][j], dp[i - zeros][j - ones] + 1);
                }
            }
            
        }
        
        return dp[m][n] ;
    }
};
