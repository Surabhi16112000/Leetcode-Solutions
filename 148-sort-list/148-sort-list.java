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
    public ListNode sortList(ListNode head) 
    {
        if(head==null || head.next==null) return head;
        
        ListNode slow=head, fast=head, temp=head;
        
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        
        ListNode left=sortList(head);
        ListNode right=sortList(slow);
        
        return merge(left,right);
    }
    
    ListNode merge(ListNode l, ListNode r)
    {
        if(l==null && r!=null) return r;
        if(l!=null && r==null) return l;
        
        ListNode temp=new ListNode(0);
        ListNode ans=temp;
        
        while(l!=null && r!=null)
        {
            if(l.val<r.val)
            {
                temp.next=l;
                l=l.next;
            }
            else
            {
                temp.next=r;
                r=r.next;
            }
            temp=temp.next;
        }
        if(l!=null) temp.next=l;
        else if(r!=null) temp.next=r;
        
        return ans.next;
    }
}