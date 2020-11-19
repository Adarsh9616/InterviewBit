/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) 
    {
        if(A==null)
        {
            return A;
        }
        int count=count(A);
        if(B>=count)
        {
            return A.next; 
        }
        int k=count-B;
        ListNode temp=A;
        while(temp!=null&&k>1)
        {
            k--;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return A;
    }
    int count(ListNode A)
    {
        int c=0;
        ListNode temp=A;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
}
