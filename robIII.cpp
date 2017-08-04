
// leetcode.com  337. House Robber III

#include <unordered_map>

class Solution {
public:
    int rob(TreeNode* root) {
        unordered_map<TreeNode *, int> m ;

        return helper(root, m ) ;  
    }

    int helper(TreeNode *root, unordered_map<TreeNode *, int>& m)
    {
        if(root == nullptr) return 0 ;

        if(m.count(root) > 0) return m[root] ;

        int val = 0 ;

        if(root->left)  val += helper(root->left->left, m) + helper(root->left->right, m) ;

        if(root->right) val += helper(root->right->left, m) + helper(root->right->right, m) ;

        val = max(root->val + val, helper(root->left, m) + helper(root->right, m)) ;

        m[root] = val ;

        return val ;
    }
};
