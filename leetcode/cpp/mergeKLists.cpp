

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

struct cmp {
    bool operator () (ListNode *a, ListNode *b) {
        return a->val > b->val;
    }
};

class Solution {
public:
    ListNode* mergeKLists(vector<ListNode*>& lists)
    {
        priority_queue<ListNode*, vector<ListNode*>, cmp)> q;

        for (int i = 0; i < lists.size(); ++i) {
            if (lists[i]) q.push(lists[i]);
        }

        ListNode *head = nullptr, *pre = nullptr, *tmp = nullptr ;

        while (!q.empty()) {
            tmp = q.top();
            q.pop();
            if (!pre) head = tmp;
            else pre->next = tmp;
            pre = tmp;
            if (tmp->next) q.push(tmp->next);
        }
        return head;
    }  

    ListNode* mergeKListsTLE(vector<ListNode*>& lists) {
        if(lists.size() == 0) return nullptr ;
        
        int n = lists.size() ;
        
        while(n > 1)
        {
            int k = (n + 1) / 2 ;
            
            for(int i = 0 ; i < k ; ++i)
            {
                lists[i] = mergeTwoLists(lists[i], lists[i+k]) ;
            }
            n = k ;
        }
        
        return lists[0] ;
    }
    
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode *header = new ListNode(-1), *curr = header ;
        
        while(l1 && l2)
        {
            if(l1->val < l2->val)
            {
                curr->next = l1 ;
                l1 = l1->next ;
            }
            else 
            {
                curr->next = l2 ;
                l2 = l2->next ;
            }
            
            curr = curr->next ;
        }
        
        if(l1) curr->next = l1 ;
        if(l2) curr->next = l2 ;
        
        return header->next ;
    }
};