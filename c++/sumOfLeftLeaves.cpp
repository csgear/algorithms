//
//  sumOfLeftLeaves.cpp
//  codefights
//
//  Created by YANGXIAOJUN on 2017/1/7.
//  Copyright © 2017年 YANGXIAOJUN. All rights reserved.
//  Leetcode: 404. Sum of Left Leaves

#include  <cstdio>

struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 } ;

class Solution {
public:
    int sumOfLeftLeaves(TreeNode* root) {
        int ans = 0 ;
        
        if(root)
        {
            TreeNode* left = root->left ;
            TreeNode* right = root->right ;
            
            if(left && (left->left == nullptr && left->right == nullptr))
            {
                ans += left->val ;
            }
            
            ans += sumOfLeftLeaves(left) + sumOfLeftLeaves(right) ;
         }
        
        return 0 ;
    }
};
