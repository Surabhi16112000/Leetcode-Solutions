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
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null) return;
        ListNode l1=head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode l2=reverse(slow);
        merge(l1,l2);
        
    }
    
    public ListNode reverse(ListNode h)
    {
        ListNode prev=null,next=null;
        while(h!=null)
        {
            next=h.next;
            h.next=prev;
            prev=h;
            h=next;
        }
        return prev;
    }
    
    public void merge(ListNode a,ListNode b)
    {
        ListNode l1=a;
        ListNode l2=b;
        
        while(l1!=null)
        {
            ListNode l1_next=l1.next;
            ListNode l2_next=l2.next;
            l1.next=l2;
            if(l1_next==null) break;
            l2.next=l1_next;
            l2=l2_next;
            l1=l1_next;
        }
        
    }
}