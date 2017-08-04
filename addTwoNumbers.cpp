
// leetcode.com 445. Add Two Numbers II

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    // copy the code from codefights' solution
    ListNode* addTwoNumbers(ListNode* a, ListNode* b) {
        vector<int> v1, v2;

        while (a)
        {
            v1.insert(v1.begin(), a->val);
            a = a->next;
        }

        while (b)
        {
            v2.insert(v2.begin(), b->val);
            b = b->next;
        }

        vector<int> res;
        int i, carry = 0, s = 0;

        for (i = 0; i < v1.size() && i < v2.size(); i++)
        {
            s = (v1[i] + v2[i] + carry) % 10;
            res.push_back(s);
            carry = (v1[i] + v2[i] + carry) / 10;
        }

        while (i < v1.size())
        {
            s = (v1[i] + carry) % 10;
            res.push_back(s);
            carry = (v1[i] + carry) / 10;
            ++i;
        }

        while (i < v2.size())
        {
            s = (v2[i] + carry) % 10;
            res.push_back(s);
            carry = (v2[i] + carry) / 10;
            ++i;
        }

        if (carry)
            res.push_back(carry);

        ListNode *header = new ListNode(-1);

        for (int i = 0; i < res.size(); i++)
        {
            ListNode *node = new ListNode(res[i]);
            node->next = header->next;
            header->next = node;
        }

        return header->next;        
    }
};