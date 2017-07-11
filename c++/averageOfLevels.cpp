//
//  averageOfLevels.cpp
//  cprime
//
//  leetcode.com 637. Average of Levels in Binary Tree
//
//

#include <vector>
#include <numeric>
#include <string>

using namespace std ;


struct TreeNode {
    int val ;
    TreeNode *left, *right ;
    TreeNode(int x): val(x), left(nullptr), right(nullptr) {}
} ;

class Solution {
public:
    
    vector<double> averageOfLevels(TreeNode* root) {
        vector<TreeNode *> level, t ;
        
        vector<double> result = {} ;
        
        level.push_back(root) ;
        
        while(level.size() > 0) {
            double sum = accumulate(level.begin(), level.end(), 0.0, [](double a, TreeNode *b)
                                    {
                                        return a + b->val ;
                                    }) ;
            
            result.push_back(1.0 * sum / level.size()) ;
            
            t = {} ;
            
            for(auto node : level)
            {
                if(node->left) t.push_back(node->left) ;
                if(node->right) t.push_back(node->right) ;
            }
            
            level = t ;
        }
        
        return result ;
    }
} ;
