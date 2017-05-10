//
//  findTheDifference.cpp
//  codefights
//
//  Created by YANGXIAOJUN on 2017/1/2.
//  Copyright © 2017年 YANGXIAOJUN. All rights reserved.
//  LeetCode  389. Find the Difference

#include <string>

using namespace std ;

class Solution {
public:
    char findTheDifference(string s, string t) {
        char ans = 0;
        for (char c : s) ans -= c;
        for (char c : t) ans += c;
        return ans;
    }
};
