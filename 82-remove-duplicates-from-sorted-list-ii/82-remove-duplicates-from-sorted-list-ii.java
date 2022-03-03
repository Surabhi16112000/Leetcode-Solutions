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
    public ListNode deleteDuplicates(ListNode head) 
    {
        ListNode D=new ListNode(0);
        D.next=head;
        ListNode t=head,dummy=D;
        if(t==null || t.next==null) return t;
        ListNode next=head;
        
        while(t!=null)
        {
            next=t.next;
            if(next!=null && t.val!=next.val)
            {
                dummy=t;
                t=next;
                
            }
            else if(next!=null && t.val==next.val)
            {
                while(next!=null && next.next!=null && next.val==next.next.val)
                    next=next.next;
                dummy.next=next.next;
                t=dummy.next;
            }
            else
            {
                t=t.next;
            }
            
        }
        return D.next;
    }
}