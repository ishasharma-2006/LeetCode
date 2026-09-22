/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode leftD=new ListNode();
        ListNode rightD=new ListNode();

        ListNode left=leftD;
        ListNode right=rightD;

        ListNode curr=head;
        int pos=1;
        while(curr!=null){
            if(pos%2==1){
                left.next=curr;
                left=left.next;
            }
            else{
                right.next=curr;
                right=right.next;
            }
            curr=curr.next;
            pos+=1;
        }
        right.next=null;
        left.next=rightD.next;
        return leftD.next;
    }
}