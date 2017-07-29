
// leetcode.com 513. Find Bottom Left Tree Value

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
    int findBottomLeftValue(TreeNode *root)
    {
        if (root == nullptr)
            return 0;

        queue<TreeNode *> q;
        int res = 0;

        q.push(root);

        while (!q.empty())
        {
            int n = q.size();

            for (int i = 0; i < n; i++)
            {
                TreeNode *node = q.front();
                q.pop();

                if (i == 0)
                    res = node->val;

                if (node->left)
                    q.push(node->left);

                if (node->right)
                    q.push(node->right);
            }
        }

        return res;
    }
};