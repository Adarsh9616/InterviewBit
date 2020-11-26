/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode A) 
    {
        if(A==null||A.next==null)
        {
            return A;
        }
        ListNode head=A.next;
        ListNode curr=A;
        ListNode prev=new ListNode(0);
        while(curr!=null&&curr.next!=null)
        {
            ListNode temp=curr.next;
            ListNode next=temp.next;
            curr.next=next;
            temp.next=curr;
            prev.next=temp;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}
