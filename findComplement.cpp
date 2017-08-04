//
//  findComplement.cpp
//  codefights
//
//  Created by YANGXIAOJUN on 2017/1/10.
//  Copyright © 2017年 YANGXIAOJUN. All rights reserved.
//  Leetcode: 476. Number Complement

#include <cmath>

class Solution {
public:
    int findComplement(int num) {
        int mask = (1 << (1 + (int)(log2(num)) ) ) - 1 ;
        
        return mask ^ num ;
    }
};
