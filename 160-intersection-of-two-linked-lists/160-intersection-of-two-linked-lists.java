/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode a, ListNode b) 
    {
        int l1=0,l2=0;
        ListNode t1=a, t2=b;
        while(t1!=null){
            l1++;
            t1=t1.next;
        }
        while(t2!=null)
        {
            l2++; 
            t2=t2.next;
        }
        t1=a; t2=b;
        if(l1>l2)
        {
            int l=l1-l2;
            while(l>0)
            {
                t1=t1.next; l--;
            }
            while(t1!=null && t2!=null)
            {
                if(t1==t2) break;
                t1=t1.next; t2=t2.next;
            }
            if(t1==null || t2==null)
            {
                return null;
            }
            else
            {
                return t1;
            }
        }
        else
        {
            int l=l2-l1;
            while(l>0)
            {
                t2=t2.next; l--;
            }
            while(t1!=null && t2!=null)
            {
                if(t1==t2) break;
                t1=t1.next; t2=t2.next;
            }
            if(t1==null || t2==null)
            {
                return null;
            }
            else
            {
                return t1;
            }
        }
        //return null;
        
    }
}