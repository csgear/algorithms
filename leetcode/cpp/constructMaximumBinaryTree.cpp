
// leetcode.com 654. Maximum Binary Tree

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
    TreeNode* constructMaximumBinaryTree(vector<int> nums) {

        if(nums.empty()) return nullptr ;

        auto mxi = max_element(nums.begin(), nums.end()) ;

        TreeNode * node = new TreeNode(*mxi) ;

        node->left =  constructMaximumBinaryTree({nums.begin(), mxi})

        node->right = constructMaximumBinaryTree({mxi + 1, nums.end()}) ;

        return node ;
    }
};