/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode A) 
    {
        if(A==null||A.next==null)
        {
            return A;
        }
        ListNode temp=A;
        ListNode mid=A;
        while(temp.next!=null&&temp.next.next!=null)
        {
            mid=mid.next;
            temp=temp.next.next;
        }
        ListNode right=mid.next;
        mid.next=null;
        ListNode left=A;
        ListNode l=sortList(left);
        ListNode r=sortList(right);
        ListNode t=merge(l,r);
        return t;
        
    }
    
    public ListNode merge(ListNode A, ListNode B)
    {
        if(A==null)
        {
            return B;
        }
        if(B==null)
        {
            return A;
        }
        if(A.val<B.val)
        {
            A.next=merge(A.next,B);
            return A;
        }
        else
        {
            B.next=merge(A,B.next);
            return B;
        }
    }
}
