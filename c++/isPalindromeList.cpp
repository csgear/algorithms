
// leetcode.com 234. Palindrome Linked List

class Solution {
public:
    bool isPalindrome(ListNode* head) {

        if(head == nullptr || head->next == nullptr) return true ;
        
        ListNode *slow = head, *fast = head;
    
        // find the middle node
        while (fast->next && fast->next->next) {
            slow = slow->next;
            fast = fast->next->next;
        }
        
        ListNode *last = slow->next, *pre = head;
        
        while (last->next) {
            ListNode *tmp = last->next;
            last->next = tmp->next;
            tmp->next = slow->next;
            slow->next = tmp;
        }
        
        while (slow->next) {
            slow = slow->next;
            if (pre->val != slow->val) return false;
            pre = pre->next;
        }
    
        return true;
    }
};