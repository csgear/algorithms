//
//  intersection.cpp
//  codefights
//
//  Created by YANGXIAOJUN on 2017/1/3.
//  Copyright © 2017年 YANGXIAOJUN. All rights reserved.
//  Leetcode:  349. Intersection of Two Arrays

#include <vector>
#include <set>

using namespace std ;

class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> s(nums1.begin(), nums1.end()), answer ;
        
        for(auto& num : nums2)
        {
            if(s.count(num))
            {
                answer.insert(num) ;
            }
        }
        return vector<int>(answer.begin(), answer.end()) ;
    }
};
