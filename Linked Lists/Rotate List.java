/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reverse(ListNode A, int k)
    {
        if(A==null)
        {
            return A;
        }
        ListNode prev=null;
        ListNode curr=A;
        ListNode next=null;
        while(curr!=null&&k>0)
        {
            k--;
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        A.next=next;
        return prev;
    }
    public int count(ListNode A)
    {
        if(A==null)
        {
            return 0;
        }
        int count=0;
        ListNode temp=A;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode rotateRight(ListNode A, int B) 
    {
        if(A==null||A.next==null)
        {
            return A;
        }
        int count=count(A);
        B=B%count;
        if(B==0)
        {
            return A;
        }
        A=reverse(A,count-B);
        A=reverse(A,count);
        A=reverse(A,B);
        return A;
    }
}
