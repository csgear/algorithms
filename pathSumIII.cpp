
// leetcode.com 437. Path Sum III

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    int pathSum(TreeNode* root, int sum) {
        if (root == nullptr) return 0 ;

        return helper(root, 0, sum) + pathSum(root->left, sum) + pathSum(root->right, sum) ;    
    }

    int helper(TreeNode *node, int pre, int &sum)
    {
        if(node == nullptr) return 0 ;

        int cur = pre + node->val ;

        return (cur == sum) + helper(node->left, cur, sum) + helper(node->right, cur, sum) ;
    }
};