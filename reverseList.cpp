//
//  reverseList.cpp
//  codefights
//
//  Created by YANGXIAOJUN on 2017/1/5.
//  Copyright © 2017年 YANGXIAOJUN. All rights reserved.
//  Leetcode 206: Reverse Linked List


struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
} ;


class Solution {
    ListNode* reverseList(ListNode* head)
    {
        if(head ==nullptr || head->next==nullptr) return head;
        
        ListNode* pre = head;
        
        ListNode* curr = head->next;
        
        pre->next = nullptr ;
        
        ListNode* next ;
        
        while(curr != nullptr)
        {
            next = curr->next;
            curr->next = pre;
            pre = curr ;
            curr = next;
        }
        return pre;
    }
} ;
