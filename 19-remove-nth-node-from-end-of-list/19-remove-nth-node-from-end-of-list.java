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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        if(head.next==null) return null;
        
        ListNode temp=head;
        ListNode move=head;
        while(n-->0)
        {
            move=move.next;
        }
        if(move==null) return head.next;
        while(move.next!=null)
        {
            temp=temp.next;
            move=move.next;
        }
        if(temp.next!=null)
        temp.next=temp.next.next;
        
        else
            temp.next=null;
        
        return head;
    }
}