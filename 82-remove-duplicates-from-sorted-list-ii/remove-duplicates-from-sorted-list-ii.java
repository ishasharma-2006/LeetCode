class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode dummy=new ListNode(0,head);
        ListNode prev=dummy;
        while(cur!=null){
            while(cur.next!=null && cur.val==cur.next.val){
                cur=cur.next;
            }
            if (prev.next==cur){
                prev=cur;
            }
            else{
                prev.next=cur.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}