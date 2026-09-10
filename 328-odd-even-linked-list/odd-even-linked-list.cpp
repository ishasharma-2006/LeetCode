/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* oddEvenList(ListNode* head) {
        if(head==nullptr) return nullptr;
        ListNode* oddCurr=head;
        ListNode* evenCurr=head->next;
        ListNode* evenHead=head->next;
        while(evenCurr!=nullptr && evenCurr->next!=nullptr){
            oddCurr->next=evenCurr->next;
            oddCurr=oddCurr->next;
            evenCurr->next=oddCurr->next;
            evenCurr=evenCurr->next;
        }
        oddCurr->next=evenHead;
        return head;
    }
};