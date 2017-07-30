
// leetcode.com  515. Find Largest Value in Each Tree Row

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
    vector<int> largestValues(TreeNode *root)
    {
        if(root == nullptr) return {} ;

        vector<int> res;
        queue<TreeNode *> q;
        q.push(root);

        while (!q.empty())
        {
            int n = q.size();
            int mx = INT_MIN;

            for (int i = 0; i < n; i++)
            {
                TreeNode *node = q.front();
                q.pop();

                mx = max(mx, node->val) ;

                if (node->left)
                    q.push(node->left);

                if (node->right)
                    q.push(node->right);
            }

            res.push_back(mx);
        }

        return res;
    }
};