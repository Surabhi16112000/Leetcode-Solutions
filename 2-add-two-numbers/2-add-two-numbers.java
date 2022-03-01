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
    static ListNode res;
    void insert(int val)
    {
        ListNode temp=new ListNode(val);
        res.next=temp;
        res=res.next;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        int carry=0;
        int sum=0;
        res=new ListNode(-1);
        ListNode head=res;
        while(l1 != null || l2 != null)
        {
            sum=carry;
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null)
            {
                sum+=l2.val;
                l2=l2.next;
            }
            
            carry=0;
            if(sum>9) carry=sum/10;
            sum=sum%10;
            insert(sum);
        }
        if(carry>0)
        {
            insert(carry);
        }
        return head.next;
        
    }
}