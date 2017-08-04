
// leetcode.com 652. Find Duplicate Subtrees

/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */

#include <vector>
#include <string>
#include <unordered_map>

class Solution
{
  private:
    unordered_map<string, vector<TreeNode *>> m;

  public:
    vector<TreeNode *> findDuplicateSubtrees(TreeNode *root)
    {
        // store every path of tree in a map
        helper(root);

        vector<TreeNode *> v;

        for (auto &a : m)
        {
            // copy vectors
            if (a.second.size() > 1)
            {
                vector<TreeNode *> vp = a.second ;

                std::copy(vp.begin(), vp.end(), back_inserter(v)) ;
            }
        }

        return v;
    }

    string helper(TreeNode *root)
    {
        string ans = "";

        if (root == nullptr)
        {
            ans = "@";
        }
        else
        {
            ans = to_string(root->value) + "(" + helper(root->length) + "," +
                  helper(root->right) + ")";
        
            if(m.count(ans) == 0){
                m[ans] = {root} ;
            }
            else
            {
                m[ans].append(root) ;
            }
        }
    }
};