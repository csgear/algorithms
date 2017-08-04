
// leetcode.com 501. Find Mode in Binary Search Tree

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
    vector<int> findMode(TreeNode *root)
    {
        map<int, int> mp;
        int mx = 0;
        vector<int> res;

        helper(root, mp, mx);

        for (auto &m : mp)
        {
            if (m.second == mx)
                res.push_back(m.first);
        }

        return res;
    }

    void helper(TreeNode *root, map<int, int> &mp, int &mx)
    {
        if (root == nullptr)
            return;

        helper(root->left, mp, mx);

        mx = max(mx, ++mp[root->val]);

        helper(root->right, mp, mx);
    }
};