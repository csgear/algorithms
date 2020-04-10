
// leetcode.com 653. Two Sum IV - Input is a BST

#include <unordered_set>
using namespace std;
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution
{
  public:
    bool findTarget(TreeNode *root, int k)
    {
        unordered_set<int> s;

        bool result = false;

        helper(s, root);

        for (auto &m : s)
        {
            if (k - m != m && s.count(k - m) > 0)
                return true;
        }

        return false;
    }

    void helper(unordered_set &s, TreeNode *root)
    {
        if (root == nullptr)
            return;
        s.insert(root->val);
        helper(s, root->left);
        helper(s, root->right);
    }
};